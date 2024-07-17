package com.example.fullogback.domain.member.controller;

import com.example.fullogback.domain.member.dto.MemberCreateDto;
import com.example.fullogback.domain.member.dto.MemberLoginDto;
import com.example.fullogback.domain.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/loginPage")
    public String loginPage() {

        return "";
    }

    @PostMapping("/signUp")
    public String signUp(MemberCreateDto memberCreateDto) {
        memberService.validateMember(memberCreateDto);
        memberService.createMember(memberCreateDto);
        return "";
    }

    @PostMapping("/login")
    public String login(MemberLoginDto memberLoginDto, HttpSession session) {

        memberService.login(memberLoginDto);
        return "/";
    }
}
