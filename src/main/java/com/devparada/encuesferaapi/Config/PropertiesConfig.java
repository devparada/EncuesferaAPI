package com.devparada.encuesferaapi.Config;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class PropertiesConfig {

    private List<String> urlcors;

    public List<String> getUrlcors() {
        return urlcors;
    }

    public void setUrlcors(List<String> urlcors) {
        this.urlcors = urlcors;
    }
}
