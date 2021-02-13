package com.nikolaychuks.quiz.controller;

import com.nikolaychuks.quiz.model.Quiz;
import com.nikolaychuks.quiz.model.Solution;
import com.nikolaychuks.quiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping
    public List<Quiz> getAllQuizzes(){
        return quizService.getAllQuizzes();
    }

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz quiz){
        return quizService.saveQuiz(quiz);
    }

    @PostMapping("/solve")
    public String solveQuiz(@RequestBody Solution solution){
        return quizService.solveQuiz(solution);
    }
}
