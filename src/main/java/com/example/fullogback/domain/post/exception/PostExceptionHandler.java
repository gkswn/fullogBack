package com.example.fullogback.domain.post.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class PostExceptionHandler {
	private static final Logger logger = LogManager.getLogger(PostExceptionHandler.class);

	@ExceptionHandler(PostException.class)
	public String handlePostException(PostException e, HttpServletRequest request) {
		logger.error("Request URL : " + request.getRequestURL());
		logger.error("Exception : " + e.getMessage());

		return e.getRedirectUrl();
	}
}
