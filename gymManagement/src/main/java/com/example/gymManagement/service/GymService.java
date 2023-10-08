package com.example.gymManagement.service;

import com.example.gymManagement.models.Gym;
import com.example.gymManagement.repository.GymRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GymService {
    final GymRepository gymRepository;

    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public String addGym(String name, String address) {
        Gym gym = Gym.builder()
                .name(name)
                .Address(address)
                .members(new ArrayList<>())
                .trainers(new ArrayList<>())
                .build();
        Gym savedGym =  gymRepository.save(gym);
        return "New Gym Addedd Succesfully!..";
    }
}
