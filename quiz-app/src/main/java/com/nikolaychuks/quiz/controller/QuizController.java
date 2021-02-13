package com.nikolaychuks.quiz.controller;

import com.nikolaychuks.quiz.model.Quiz;
import com.nikolaychuks.quiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz quiz){
        return quizService.saveQuiz(quiz);
    }
}
