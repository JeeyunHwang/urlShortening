package com.example.mss.controller;

import com.example.mss.component.ShortenUrlComponent;
import com.example.mss.model.UrlEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/url")
public class MssRestController {

    @PostMapping
    @ResponseBody
    public UrlEntity makeUrlShorten(@RequestBody @Valid UrlEntity reqEntity){

        UrlEntity shortenEntity = ShortenUrlComponent.getEntity(reqEntity.getOriginUrl());
        UrlEntity entity = UrlEntity.builder()
                .originUrl(reqEntity.getOriginUrl())
                .count(1)
                .createdDt(LocalDateTime.now()).build();

        if(shortenEntity != null){
            ShortenUrlComponent.addCountShortenUrl(shortenEntity.getShortenUrl());
            return shortenEntity;
        }else{
            UrlEntity entityMade = ShortenUrlComponent.addShortenUrl(entity);
            ShortenUrlComponent.addCountShortenUrl(entityMade.getShortenUrl());

            return entityMade;

        }
    }
}
