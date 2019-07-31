package com.example.second;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Long> {

    List<Book> findAll();

}
