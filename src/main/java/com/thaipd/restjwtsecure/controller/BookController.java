package com.thaipd.restjwtsecure.controller;

import com.thaipd.restjwtsecure.model.Book;
import com.thaipd.restjwtsecure.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/all")
    public String getAllBook() {
        return "List of books";
    }
}
