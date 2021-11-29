package com.example.mss.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ShortenUrlRequest {
    @NotNull
    @URL(message = "URL 형식을 갖춰주세요")
    String url;
}
