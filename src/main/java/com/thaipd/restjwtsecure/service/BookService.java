package com.thaipd.restjwtsecure.service;

import com.thaipd.restjwtsecure.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {
    public List<Book> findTatcaBook();
}
