package com.nikolaychuks.motivation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTIVATION")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Motivation {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
}
