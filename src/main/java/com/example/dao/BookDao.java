package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author bz_c
 * @version 1.0
 * 注解自动装配
 * 我进行了dao的第一次修改操作
 * 使用IDEA对DAO进行修改测试
 */
@SuppressWarnings("all")
@Mapper
public interface BookDao {
    @Insert("insert into book values(null, #{type}, #{name}, #{description})")  // book中的属性
    void save(Book book);

    @Delete("delete from book where id=#{id}")
    void delete(int id);

    @Update("update book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    void update(Book book);

    @Select("select * from book where id=#{id}")
    Book findById(int id);

    @Select("select * from book")
    List<Book> getAll();
}
