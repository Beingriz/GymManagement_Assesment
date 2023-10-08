package com.example.gymManagement.controller;

import com.example.gymManagement.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
public class GymController {
    final GymService gymService;
    @Autowired
    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @PostMapping("/add")
    public String addGym(@RequestParam String name, @RequestParam String address){
        return gymService.addGym(name, address);
    }
}
