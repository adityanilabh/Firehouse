package com.journey.ratelimiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateLimiterApplication {

    public static void main(String[] args) {
        // Enable virtual threads
        System.setProperty("spring.threads.virtual.enabled", "true");
        SpringApplication.run(RateLimiterApplication.class, args);
    }

}
