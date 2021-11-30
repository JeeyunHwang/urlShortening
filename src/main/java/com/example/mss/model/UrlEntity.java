package com.example.mss.model;

import lombok.*;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class UrlEntity {
    @URL
    private String originUrl;
    private String shortenUrl;
    private LocalDateTime createdDt;
    private Integer count;

    public UrlEntity(){}

    public void addCount(){
        this.count = this.count+1;
    }
}
