package com.msacomponet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.DateFormatter;


@Configuration
public class DivideServerConfig {

    @Bean
    public DateFormatter localDateFormatter(String localDatePattern) {
        return new DateFormatter(localDatePattern);
    }
}
