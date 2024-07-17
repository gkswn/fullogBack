package com.example.fullogback.domain.member.controller;

import com.example.fullogback.domain.member.dto.MemberCreateDto;
import com.example.fullogback.domain.member.dto.MemberLoginDto;
import com.example.fullogback.domain.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/loginPage")
    public String loginPage() {
        return "";
    }

    @PostMapping("/signUp")
    public ResponseEntity<String> signUp(MemberCreateDto memberCreateDto) {
        memberService.validateInetId(memberCreateDto);
        memberService.validatePwd(memberCreateDto);
        memberService.createMember(memberCreateDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public String login(MemberLoginDto memberLoginDto, HttpSession session) {
        memberService.login(memberLoginDto);
        return "/";
    }
}
