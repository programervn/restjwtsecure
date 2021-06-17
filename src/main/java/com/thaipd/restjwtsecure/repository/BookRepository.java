package com.thaipd.restjwtsecure.repository;

import com.thaipd.restjwtsecure.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "select * from Book b", nativeQuery = true)
    List<Book> xxxLayDanhSach();
}
