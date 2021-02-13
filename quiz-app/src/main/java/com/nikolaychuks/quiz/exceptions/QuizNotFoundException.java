package com.nikolaychuks.quiz.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class QuizNotFoundException extends RuntimeException{
    private Long id;
}
