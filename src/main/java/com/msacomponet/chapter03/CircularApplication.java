package com.msacomponet.chapter03;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CircularApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctxt = SpringApplication.run(CircularApplication.class);
        com.msacomponet.service.CircularService circularService = ctxt.getBean(
            com.msacomponet.service.CircularService.class);
        ctxt.close();
    }
}