package com.nikolaychuks.quiz.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Enabled
@Table(name = "QUIZ")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    private Long id;
    private String title;
    private String answer;
    private String description;
}
