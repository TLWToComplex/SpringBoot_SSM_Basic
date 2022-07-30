package com.example.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bz_c
 * @version 1.0
 * domain
 * 对domain的第一次修改
 */
@Setter
@Getter
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    public Book() {
    }

    public Book(Integer id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
