package com.manohar3969.empawar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173", "https://empawar-9fpb.onrender.com")  // Allow your React app
                .allowedMethods("*")                      // GET, POST, PUT, DELETE, etc.
                .allowedHeaders("*");
    }
}
