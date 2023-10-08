package com.example.gymManagement.controller;

import com.example.gymManagement.Dto.MemberRequest;
import com.example.gymManagement.Dto.MemberResponse;
import com.example.gymManagement.repository.MemberRepository;
import com.example.gymManagement.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    final MemberService memberService;
    final MemberRepository memberRepository;

    public MemberController(@RequestBody MemberService memberService, MemberRepository memberRepository) {
        this.memberService = memberService;
        this.memberRepository = memberRepository;
    }

    @PostMapping("/add")
    public String addMember(MemberRequest memberRequest){
        return memberService.addMember(memberRequest);
    }

    @GetMapping("/get")
    public ResponseEntity getMember(@RequestParam int id){
        try {
            MemberResponse memberResponse  = memberService.getMember(id);
            return new ResponseEntity<>(memberResponse, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
