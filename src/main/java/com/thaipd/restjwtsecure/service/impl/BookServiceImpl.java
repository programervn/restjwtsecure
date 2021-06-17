package com.thaipd.restjwtsecure.service.impl;

import com.thaipd.restjwtsecure.model.Book;
import com.thaipd.restjwtsecure.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceImpl")
public class BookServiceImpl {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findTatcaBook() {
        List<Book> book = bookRepository.xxxLayDanhSach();
        return book;
    }
}
