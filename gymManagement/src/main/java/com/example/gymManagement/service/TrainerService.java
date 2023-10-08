package com.example.gymManagement.service;

import com.example.gymManagement.Dto.TrainerRequest;
import com.example.gymManagement.exception.GymNotFounException;
import com.example.gymManagement.models.Gym;
import com.example.gymManagement.models.Trainer;
import com.example.gymManagement.repository.GymRepository;
import com.example.gymManagement.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TrainerService {

    final GymRepository gymRepository;
    final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(GymRepository gymRepository, TrainerRepository trainerRepository) {
        this.gymRepository = gymRepository;
        this.trainerRepository = trainerRepository;
    }

    public String addTrainer(TrainerRequest trainerRequest) {
        Optional<Gym> optionalGym = gymRepository.findById(trainerRequest.getGymId());
        if(!optionalGym.isPresent()){
            throw new GymNotFounException("Invalid Gym Id!!..");
        }
        Gym gym = optionalGym.get();
        Trainer trainer = Trainer.builder()
                .name(trainerRequest.getName())
                .age(trainerRequest.getAge())
                .gender(trainerRequest.getGender())
                .gym(gym)
                .members(new ArrayList<>())
                .build();
        Trainer savedTrainer = trainerRepository.save(trainer);
        return "Trainer Added Sucessfully!..";
    }
}
