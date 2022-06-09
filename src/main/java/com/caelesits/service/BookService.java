package com.caelesits.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caelesits.domain.Book;

import java.util.List;

/**
 * @author Caelesits

 * @create 2022/6/7 19:56
 **/
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);

}
