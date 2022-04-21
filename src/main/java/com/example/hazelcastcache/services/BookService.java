package com.example.hazelcastcache.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Cacheable("book")
    public String getBookByIsbn(String isbn){
        System.out.println("inside of finding book");
        return findBookSLowSource(isbn);
    }

    private String findBookSLowSource(String isbn) {
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "sample book name";
    }
}
