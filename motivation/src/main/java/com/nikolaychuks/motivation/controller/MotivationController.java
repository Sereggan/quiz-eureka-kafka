package com.nikolaychuks.motivation.controller;

import com.nikolaychuks.motivation.model.Motivation;
import com.nikolaychuks.motivation.service.MotivationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motivation")
@RequiredArgsConstructor
public class MotivationController {

    private final MotivationService motivationService;

    @PostMapping
    public Motivation addMotivation(@RequestBody Motivation motivation) {
        return motivationService.addMotivation(motivation);
    }

    @GetMapping
    public String getMotivation() {
        return motivationService.getMotivation();
    }
}
