package com.example.hazelcastcache.controllers;

import com.example.hazelcastcache.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    
    private BookService bookService;
    
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("{isbn}")
    public String getBookNameByIsbn(@PathVariable("isbn") String isbn) {
            return bookService.getBookByIsbn(isbn);
    }
}