package com.qmagician.vuesprintboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class VueSprintbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSprintbootApplication.class, args);
    }

}
