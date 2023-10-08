package com.example.gymManagement.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String Address;

    @OneToMany(mappedBy = "gym", cascade = CascadeType.ALL)
    List<Member> members = new ArrayList<>();

    @OneToMany(mappedBy = "gym", cascade = CascadeType.ALL)
    List<Trainer> trainers = new ArrayList<>();

}
