package com.caelesits.domain;

import lombok.Data;

/**
 * @author Caelesits
 * @description:书籍实体类
 * @create 2022/6/7 12:34
 **/
//lombok
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
