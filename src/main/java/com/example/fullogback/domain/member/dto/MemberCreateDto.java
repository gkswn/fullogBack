package com.example.fullogback.domain.member.dto;

import com.example.fullogback.domain.member.entity.MemberEntity;
import lombok.Builder;

import java.util.UUID;

@Builder
public record MemberCreateDto(
        String inetId,
        String pwd,
        String pwdChk,
        String email,
        String nickName
) {
    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .id(UUID.randomUUID().toString())
                .inetId(this.inetId)
                .pwd(this.pwd)
                .nickName(this.nickName)
                .email(this.email).build();
    }
}
