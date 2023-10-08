package com.example.gymManagement.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Enumerated(EnumType.STRING)
    Gender gender;
    int age;

    @ManyToOne
    @JoinColumn
    Gym gym;

    @ManyToOne
    @JoinColumn
    Trainer trainer;



}
