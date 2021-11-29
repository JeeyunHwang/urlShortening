package com.example.mss.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class ServletConfig implements WebMvcConfigurer {
    public void configureViewResolvers(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
}
