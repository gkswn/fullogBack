package com.example.fullogback.domain.member.repository;

import com.example.fullogback.domain.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByInetId(String inetId);

    Optional<MemberEntity> findByInetIdAndPwd(String inetId, String pwd);
}
