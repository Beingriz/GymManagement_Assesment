package com.example.gymManagement.service;

import com.example.gymManagement.Dto.MemberRequest;
import com.example.gymManagement.Dto.MemberResponse;
import com.example.gymManagement.exception.MemberNotFoundException;
import com.example.gymManagement.models.Member;
import com.example.gymManagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String addMember(MemberRequest memberRequest) {
        Member member = Member.builder()
                .name(memberRequest.getName())
                .gender(memberRequest.getGender())
                .age(memberRequest.getAge())
                .build();
        Member savedMember = memberRepository.save(member);
        return "Memeber Created Succesfully!!.";
    }

    public MemberResponse getMember(int id) {
        Optional<Member> optionalMember =  memberRepository.findById(id);
        if(!optionalMember.isPresent()){
            throw new MemberNotFoundException("Invalid Member Id!!");
        }
        Member member = optionalMember.get();
        return MemberResponse.builder()
                .name(member.getName())
                .age(member.getAge())
                .gender(member.getGender())
                .build();
    }
}
