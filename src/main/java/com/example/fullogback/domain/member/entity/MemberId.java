package com.example.fullogback.domain.member.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Embeddable
public class MemberId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String memberId;

    private UUID uuid;
}
