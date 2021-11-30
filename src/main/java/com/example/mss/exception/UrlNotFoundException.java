package com.example.mss.exception;

public class UrlNotFoundException extends RuntimeException{
    String message;

    public UrlNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
