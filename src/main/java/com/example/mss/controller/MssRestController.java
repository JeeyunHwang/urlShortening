package com.example.mss.controller;

import com.example.mss.model.ShortenUrlRequest;
import com.example.mss.service.ShortenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/url")
public class MssRestController {

    @Autowired
    private final ShortenService shortenService;

    @GetMapping("/{url}")
    @ResponseBody
    public String makeUrlShorten(@PathVariable @Valid ShortenUrlRequest url){
        log.debug("makeUrlShorten url : [{}]", url.getUrl());
        String shortenUrl = shortenService.makeShortenURL(url.getUrl());
        log.debug("makeUrlShorten shortenUrl : [{}]", shortenUrl);

        return shortenUrl;
    }
}
