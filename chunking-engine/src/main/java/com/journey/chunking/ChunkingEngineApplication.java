package com.journey.chunking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChunkingEngineApplication {

    public static void main(String[] args) {
        // Enable virtual threads
        System.setProperty("spring.threads.virtual.enabled", "true");
        SpringApplication.run(ChunkingEngineApplication.class, args);
    }

}
