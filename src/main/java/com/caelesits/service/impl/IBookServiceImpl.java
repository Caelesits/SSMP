package com.caelesits.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caelesits.dao.BookDao;
import com.caelesits.domain.Book;
import com.caelesits.service.IBookService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @author Caelesits
 * @create 2022/6/8 17:51
 **/
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Resource
    private BookDao bookDao;

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Boolean insert(Book book) {
        return bookDao.deleteById(book) > 0;
    }

    @Override
    public Boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Book get(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        bookDao.selectPage(page, null);
        return page;
    }
}
