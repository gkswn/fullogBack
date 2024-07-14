package com.example.fullogback.domain.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity {
    @EmbeddedId
    private MemberId id;

    @Column
    private String name;

    @Column
    private String pwd;

    @Column
    private String pwdChk;

    @Column
    private String email;

    @Column
    private String phoneNum;

    @Column
    private MemberStatus memberStatus;


}
