package com.example.gymManagement.Dto;

import com.example.gymManagement.models.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponse {
    String name;
    Gender gender;
    int age;
}
