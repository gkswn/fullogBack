package com.example.fullogback.domain.member.service;

import com.example.fullogback.domain.member.dto.MemberCreateDto;
import com.example.fullogback.domain.member.dto.MemberLoginDto;
import com.example.fullogback.domain.member.entity.MemberEntity;
import com.example.fullogback.domain.member.exception.MemberException;
import com.example.fullogback.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepo;

    @Transactional
    public void createMember(MemberCreateDto memberCreateDto) {
        memberRepo.save(memberCreateDto.toEntity());
    }

    public void validateInetId(MemberCreateDto memberCreateDto) {
         String alreadyExistInetId = memberRepo.findByInetId(memberCreateDto.inetId()).getInetId();
         if(!alreadyExistInetId.isEmpty()) {
             throw new MemberException("이미 존재하는 아이디입니다.");
         }
    }

    public void validatePwd(MemberCreateDto memberCreateDto) {
        if (!memberCreateDto.pwd().equals(memberCreateDto.pwdChk())) {
            throw new MemberException("비밀번호와 비밀번호 확인이 일치하지 않습니다", "/");
        }
    }

    public MemberEntity login(MemberLoginDto memberLoginDto) {
        MemberEntity memberEntity = memberRepo.findByInetIdAndPwd(memberLoginDto.inetId(), memberLoginDto.pwd())
                .orElseThrow(() -> new MemberException("찾을 수 없는 회원입니다. 아이디 혹은 비밀번호를 확인하세요.", "/"));

        return memberEntity;
    }
}
