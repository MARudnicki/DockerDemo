package com.example.second;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class ExternalServiceInDocker implements CommandLineRunner {

    private final BookDao bookDao;

    @Override
    public void run(String... args) throws Exception {
        bookDao.saveAll(Arrays.asList(
            new Book("aaa"),
            new Book("bbb"),
            new Book("ccc")
        ));
    }

    public static void main(String[] args) {
        SpringApplication.run(ExternalServiceInDocker.class, args);
    }

}