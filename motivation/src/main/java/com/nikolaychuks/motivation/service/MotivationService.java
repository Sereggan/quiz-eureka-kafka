package com.nikolaychuks.motivation.service;

import com.nikolaychuks.motivation.model.Motivation;
import com.nikolaychuks.motivation.repository.MotivationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MotivationService {

    private final MotivationRepository motivationRepository;

    public String getMotivation() {
        return motivationRepository.findAll().stream()
                .findFirst()
                .map(Motivation::getText)
                .orElse(getFixedMotivation());
    }

    private String getFixedMotivation() {
        return "You are doing great!";
    }

    public Motivation addMotivation(Motivation motivation) {
        return motivationRepository.save(motivation);
    }
}
