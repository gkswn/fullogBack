package com.example.fullogback.domain.member.entity;

import com.example.fullogback.custom.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends BaseEntity {

    @Column
    private String inetId;

    @Column
    private String nickName;

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

    @Column
    private MemberType memberType;

}
