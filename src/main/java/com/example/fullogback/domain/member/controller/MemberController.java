package com.example.fullogback.domain.member.controller;

import com.example.fullogback.domain.member.dto.MemberCreateDto;
import com.example.fullogback.domain.member.dto.MemberLoginDto;
import com.example.fullogback.domain.member.entity.MemberEntity;
import com.example.fullogback.domain.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/loginPage")
    public String loginPage() {
        return "";
    }

    @PostMapping("/signUp")
    public ResponseEntity<String> signUp(
            @RequestBody MemberCreateDto memberCreateDto
    ) {
        memberService.validateInetId(memberCreateDto);
        memberService.validatePwd(memberCreateDto);
        memberService.createMember(memberCreateDto);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public String login(@RequestBody MemberLoginDto memberLoginDto, HttpSession httpSession) {
        MemberEntity memberEntity = memberService.login(memberLoginDto);
        httpSession.setAttribute("memberEntity", memberEntity);

        return "/";
    }


}
