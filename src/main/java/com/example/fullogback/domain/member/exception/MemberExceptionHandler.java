package com.example.fullogback.domain.member.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MemberExceptionHandler {
    // ModelAndView 객체 생성

    // CustomException 처리 핸들러
    @ExceptionHandler(MemberException.class)
    public ModelAndView handleCustomException(MemberException ex, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", ex.getMessage());
        modelAndView.setViewName("redirect:" + ex.getRedirectUrl());

        return modelAndView;
    }
}
