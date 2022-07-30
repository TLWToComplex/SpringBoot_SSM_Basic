package com.example.service.imple;

import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bz_c
 * @version 1.0
 */
@Service
public class BookServiceImple implements BookService {

    @Autowired
    private BookDao bookDao;  // 依赖注入

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;  // 抛异常的时候return false即可
    }

    @Override
    public boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    /**
     * 异常处理器的测试操作
     */
    @Override
    public Book findById(int id) {
        /*// 处理业务异常
        if(id == 1) {
            throw new BusinessException("请认真进行操作", Code.BUSINESS_ERR);  // 发送到异常处理器
        }
        // 处理系统异常
        try {
            int a = 1 / 0;
        }catch (Exception e) {
            throw new SystemException("服务器连接超时，请重试", e, Code.SYSTEM_ERR);
        }*/

        return bookDao.findById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
