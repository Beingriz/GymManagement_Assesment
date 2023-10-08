package com.example.gymManagement.repository;

import com.example.gymManagement.models.Gym;
import com.example.gymManagement.models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
}
