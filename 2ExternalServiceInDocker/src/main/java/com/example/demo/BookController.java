package com.example.demo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("books")
public class BookController {

    private final BookDao bookDao;

    @GetMapping
    public List<Book> getBooks() {
        log.info("Fetch all books");

        return bookDao.findAll();
    }

}
