package com.devparada.encuesferaapi.Config;

import org.springframework.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private PropertiesConfig propertiesConfig;

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(propertiesConfig.getUrlcors().toArray(new String[0]))
                .allowedMethods("GET")
                .allowedHeaders("Content-Type", "Authorization", "X-Requested-With", "Accept", "Origin");
    }
}
