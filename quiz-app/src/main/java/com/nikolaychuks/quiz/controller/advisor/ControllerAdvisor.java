package com.nikolaychuks.quiz.controller.advisor;

import com.nikolaychuks.quiz.exceptions.QuizNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(value = QuizNotFoundException.class)
    protected ResponseEntity<Object> handleQuizNotFOundException(QuizNotFoundException exception){
        log.debug("Could not find Quiz, id: {}", exception.getId());
        return new ResponseEntity<>("Quiz not found", HttpStatus.NOT_FOUND);
    }
}
