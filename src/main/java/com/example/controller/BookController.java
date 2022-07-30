package com.example.controller;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bz_c
 * @version 1.0
 * 返回Json数据即可
 */
@RestController
@RequestMapping("/books")  // 统一路径
@SuppressWarnings("all")
public class BookController {

    @Autowired  // 自动装配业务层接口
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean save = bookService.save(book);

        return new Result(save, save ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean update = bookService.update(book);

        return new Result(update, update ? Code.UPDATE_OK : Code.UPDATE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        boolean delete = bookService.delete(id);

        return new Result(delete, delete ? Code.DELETE_OK : Code.DELETE_ERR);
    }


    @GetMapping("/{id}")
    public Result findById(@PathVariable int id) {
        Book book = bookService.findById(id);
        Integer code = book != null ? Code.SELECT_OK :Code.SELECT_ERR;
        String message = book != null ? "" : "数据查询失败，请重试！";
        return new Result(book, code, message);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String message = books != null ? "" : "数据查询失败，请重试！";

        return new Result(books, code, message);
    }
}
