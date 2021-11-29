package com.example.mss.service.impl;

import com.example.mss.service.ShortenService;
import org.springframework.stereotype.Service;

@Service
public class ShortenServiceImpl implements ShortenService {
    /**
     * URL을 입력받아 압축 URL 생성하고,
     * 벨리데이션을 체크하고 데이터에 저장 */
    @Override
    public String makeShortenURL(String url){
        String shortUrl="";

        return shortUrl;
    }
}
