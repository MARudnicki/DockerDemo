package com.example.DockerDemo;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class PublishingDocker {

    public static void main(String[] args) {
        SpringApplication.run(PublishingDocker.class, args);
    }

    @GetMapping("**")
    String getHello() {
        log.info("Hello 4PublishingDocker called");

        return "Hello 4PublishingDocker " + Instant.now();
    }
}
