package com.example.mss.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class ServletConfig implements WebMvcConfigurer {

    /**
     * mvc:resources 설정<br>
     * mapping = "/static/**", location = "/static/"
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    /**
     * viewResolver 설정<br>
     * @return ViewResolver
     */
    public void configureViewResolvers(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
}
