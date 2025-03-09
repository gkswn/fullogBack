package com.example.fullogback.domain.post.exception;

import lombok.Getter;

@Getter
public class PostException extends RuntimeException {

	private String msg;
	private String redirectUrl;

	public PostException(String msg, String redirectUrl) {
		super(msg);
		this.msg = msg;
		this.redirectUrl = redirectUrl;
	}

	public PostException(String message) {
		super(message);
		this.msg = message;
	}
}
