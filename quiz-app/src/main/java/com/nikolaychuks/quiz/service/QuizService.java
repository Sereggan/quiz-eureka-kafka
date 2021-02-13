package com.nikolaychuks.quiz.service;

import com.nikolaychuks.quiz.model.Quiz;
import com.nikolaychuks.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository repository;

    public Quiz saveQuiz(Quiz quiz){
        return repository.save(quiz);
    }
}
