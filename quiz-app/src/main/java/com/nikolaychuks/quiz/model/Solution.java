package com.nikolaychuks.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Solution {

    private Long quizId;
    private String answer;
}
