package com.example.gymManagement.Dto;

import com.example.gymManagement.models.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrainerRequest {
    String name;
    Gender gender;
    int age;
    int GymId;
}
