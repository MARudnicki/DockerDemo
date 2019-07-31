package com.example.third;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@AllArgsConstructor
@EnableScheduling
@Slf4j
public class CommunicationWithDocker {

    public static void main(String[] args) {
        SpringApplication.run(CommunicationWithDocker.class, args);
    }

    @Scheduled(fixedDelay = 5 * 1000)//every 5 sec
    public void updateFile() throws Exception {
        log.info("Update file wakes up");

        byte[] data = ("Now is " + Instant.now()+ " \n").getBytes();

        Files.write(
                Paths.get("/tmp/test.txt"),
                data,
                StandardOpenOption.APPEND);

    }

}