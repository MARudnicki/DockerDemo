package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class Book {

    @GeneratedValue
    @Id
    private Long id;

    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }
}
