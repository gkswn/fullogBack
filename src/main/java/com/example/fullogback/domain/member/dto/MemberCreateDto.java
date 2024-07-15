package com.example.fullogback.domain.member.dto;

import com.example.fullogback.domain.member.entity.MemberEntity;
import lombok.Builder;

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
                .inetId(this.inetId)
                .pwd(this.pwd)
                .pwdChk(this.pwdChk)
                .nickName(this.nickName)
                .email(this.email).build();
    }
}
