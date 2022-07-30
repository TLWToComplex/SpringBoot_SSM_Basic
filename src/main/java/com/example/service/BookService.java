package com.example.service;

import com.example.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author bz_c
 * @version 1.0
 * 对service的第一次修改
 */
@Transactional
public interface BookService {
    boolean save(Book book);

    boolean delete(int id);

    boolean update(Book book);

    Book findById(int id);

    List<Book> getAll();
}
