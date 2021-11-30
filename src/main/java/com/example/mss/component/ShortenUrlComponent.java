package com.example.mss.component;

import com.example.mss.model.UrlEntity;
import com.example.mss.util.ShortenUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShortenUrlComponent {

    public static Map<String, UrlEntity> urlMap = new HashMap();

    public static int getMapSize(){
        return urlMap.size();
    }

    public static UrlEntity getEntity(String url){
        UrlEntity entity = null;
        for(String key : urlMap.keySet()){
            if(urlMap.get(key).getOriginUrl().equals(url)){
                entity = urlMap.get(key);
                break;
            }
        }
        return entity;
    }

    // 압축 url 저장
    public static UrlEntity addShortenUrl(UrlEntity entity) {
        entity.setCount(1);
        String key = ShortenUtil.encoding(getMapSize());
        entity.setShortenUrl(key);
        urlMap.put(key, entity);
        return urlMap.get(key);
    }

    // 압축 url 호출 횟수 증가
    public static void addCountShortenUrl(String urlKey) {
        urlMap.get(urlKey).addCount();
    }

    // 압축url로 맵 체크
    public static UrlEntity getHavingShortenUrl(String urlKey){
        return (urlMap.keySet().contains(urlKey))? urlMap.get(urlKey) : null;
    }
}
