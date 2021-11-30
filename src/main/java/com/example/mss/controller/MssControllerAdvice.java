package com.example.mss.controller;

import com.example.mss.exception.UrlNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MssControllerAdvice {

    /**
     * 없는 URL 발생시 에러페이지 이동
     * */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UrlNotFoundException.class)
    public String ShortenUrlNotFoundHandler(UrlNotFoundException e, Model model){
        model.addAttribute("errorMsg", e.getMessage());
        return "/error/urlNotFound";
    }
}
