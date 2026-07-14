package com.journey.firehose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FirehoseApplication {

    public static void main(String[] args) {
        // Enable virtual threads
        System.setProperty("spring.threads.virtual.enabled", "true");
        SpringApplication.run(FirehoseApplication.class, args);
    }

}
