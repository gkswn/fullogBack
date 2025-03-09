package com.example.fullogback.domain.member.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MemberExceptionHandler {
    private static final Logger logger = LogManager.getLogger(MemberExceptionHandler.class);

    // CustomException 처리 핸들러
    @ExceptionHandler(MemberException.class)
    public String handleCustomException(MemberException ex, HttpServletRequest request) {

        logger.error("Request URL : " + request.getRequestURL());
        logger.error("Exception : " + ex.getMessage());

        return ex.getRedirectUrl();
    }
}
