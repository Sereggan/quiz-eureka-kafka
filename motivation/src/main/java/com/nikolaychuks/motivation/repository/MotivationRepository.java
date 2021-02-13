package com.nikolaychuks.motivation.repository;


import com.nikolaychuks.motivation.model.Motivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivationRepository extends JpaRepository<Motivation, Long> {
}
