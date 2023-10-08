package com.example.gymManagement.repository;

import com.example.gymManagement.models.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {
}
