package com.example.mss.controller;

import com.example.mss.component.ShortenUrlComponent;
import com.example.mss.exception.UrlNotFoundException;
import com.example.mss.model.UrlEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MssController {

    private static Logger logger = LoggerFactory.getLogger(MssController.class);

    /**
     * URL 입력 폼 제공 및 결과 출력 Page 호출
     **/
    @GetMapping
    public String index(){
        return "index";
    }

    /**
     * 압축 URL 요청으로 리다이렉트 URL Page 호출
     **/
    @GetMapping(path = "/redirect/{shortenUrl:[0-9a-zA-Z]+}")
    @ResponseBody
    public String urlShortenRedirect(@PathVariable("shortenUrl") String url){

        try{

            UrlEntity entity = ShortenUrlComponent.getHavingShortenUrl(url);
            return entity.getOriginUrl();

        }catch (NullPointerException npe){
            throw new UrlNotFoundException("존재하지않는 url입니다.");
        }
    }
}
