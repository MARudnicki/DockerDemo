package com.example.first;

import java.time.Instant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class SingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleApplication.class, args);
    }

    @GetMapping("/**")
    public String getHello() {
        log.info("Hello called");

        return "Hello " + Instant.now();
    }
}
