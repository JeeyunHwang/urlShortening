package com.example.mss.exception;

public class UrlShorteningException extends RuntimeException{
    String message;

    public UrlShorteningException(String message){
        super(message);
        this.message = message;
    }
}
