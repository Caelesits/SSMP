package com.caelesits.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caelesits.domain.Book;

public interface IBookService extends IService<Book> {
    Boolean delete(Integer id);
    Boolean insert(Book book);
    Boolean modify(Book book);
    Book get(Integer id);
    IPage<Book> getPage(int currentPage,int pageSize);
}
