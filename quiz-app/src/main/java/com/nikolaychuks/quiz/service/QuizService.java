package com.nikolaychuks.quiz.service;

import com.nikolaychuks.quiz.exceptions.QuizNotFoundException;
import com.nikolaychuks.quiz.model.Quiz;
import com.nikolaychuks.quiz.model.Solution;
import com.nikolaychuks.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository repository;
    private final RestTemplate restTemplate;

    @Value("${motivationservice.url}")
    private String motivationServiceUrl;

    public Quiz saveQuiz(Quiz quiz) {
        return repository.save(quiz);
    }

    public String solveQuiz(Solution solution) {
        Quiz quiz = repository.findById(solution.getQuizId()).orElseThrow(() -> new QuizNotFoundException(solution.getQuizId()));
        return checkSoltuion(quiz.getAnswer(), solution.getAnswer());
    }

    public List<Quiz> getAllQuizzes() {
        return repository.findAll();
    }

    private String checkSoltuion(String correctAnswer, String userAnswer) {
        return correctAnswer.equals(userAnswer) ? "You are absolutely right!" : getMotivationMessage();
    }

    private String getMotivationMessage() {
        return restTemplate.getForObject(motivationServiceUrl, String.class);
    }
}
