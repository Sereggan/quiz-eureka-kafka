package com.nikolaychuks.quiz.repository;

import com.nikolaychuks.quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
