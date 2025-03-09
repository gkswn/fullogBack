package com.example.fullogback.domain.member.entity;

import com.example.fullogback.custom.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends BaseEntity {

    @Id
    private String id;

    @Column
    private String inetId;

    @Column
    private String nickName;

    @Column
    private String pwd;

    @Column
    private String email;

    @Column
    private String phoneNum;

    @Column
    private MemberStatus memberStatus;

    @Column
    private MemberType memberType;

}
