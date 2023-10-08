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
public class Trainer {
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

    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL)
    List<Member> members = new ArrayList<>();
}
