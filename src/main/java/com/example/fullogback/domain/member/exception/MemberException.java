package com.example.fullogback.domain.member.exception;

import lombok.Getter;

@Getter
public class MemberException extends RuntimeException {
    private String msg;
    private String redirectUrl;

    public MemberException(String message, String redirectUrl) {
        super(message);
        this.msg = message;
        this.redirectUrl = redirectUrl;
    }

    public MemberException(String message) {
        super(message);
        this.msg = message;
    }


}
