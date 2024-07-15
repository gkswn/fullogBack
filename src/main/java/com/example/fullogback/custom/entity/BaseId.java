package com.example.fullogback.custom.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;

@Getter
@Embeddable
public class BaseId {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
