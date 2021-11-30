package com.example.mss.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ShortenUrlRequest {
    @NotNull
    @URL(message = "URL 형식이 아닙니다")
    String url;
}
