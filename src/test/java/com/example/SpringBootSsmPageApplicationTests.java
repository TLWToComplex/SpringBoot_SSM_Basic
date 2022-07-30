package com.example;

import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.Book;

import java.util.List;


@SpringBootTest
class SpringBootSsmPageApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void getBookById() {
        Book book = bookService.findById(1);
        System.out.println(book);
    }

    @Test
    public void getAllBook() {
        List<Book> books = bookService.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void insert() {
        bookService.save(new Book(null, "1", "1", "1"));
    }
}
