package com.example.gymManagement.controller;

import com.example.gymManagement.Dto.TrainerRequest;
import com.example.gymManagement.exception.GymNotFounException;
import com.example.gymManagement.models.Gym;
import com.example.gymManagement.models.Trainer;
import com.example.gymManagement.repository.GymRepository;
import com.example.gymManagement.repository.TrainerRepository;
import com.example.gymManagement.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    final TrainerService trainerService;
    final GymRepository gymRepository;
    final TrainerRepository trainerRepository;

    @Autowired
    public TrainerController(TrainerService trainerService, GymRepository gymRepository, TrainerRepository trainerRepository) {
        this.trainerService = trainerService;
        this.gymRepository = gymRepository;
        this.trainerRepository = trainerRepository;
    }

    public String addTrainer(@RequestBody TrainerRequest trainerRequest){

        return trainerService.addTrainer(trainerRequest);

    }

}
