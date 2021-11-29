package com.example.mss.controller;

import com.example.mss.model.ShortenUrlRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MssController {

    /**
     * URL입력 폼 제공 및 결과 출력 Page 호출
     * */
    @GetMapping
    public String index(){
        log.debug("urlShortenPage Open");

        return "Test";
    }

    /**
     * 압축 URL 요청으로 원래 URL Page 리다이렉트 호출
     * */
    @GetMapping(path = "/{shortenUrl}")
    public String urlShortenRedirect(@PathVariable("shortenUrl") ShortenUrlRequest url){
        log.debug("urlShortenPage Open");

        return "redirect:"+url.getUrl();
    }


}
