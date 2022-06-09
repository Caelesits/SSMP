package com.caelesits.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caelesits.domain.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Caelesits

 * @create 2022/6/7 14:03
 **/

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
//        System.out.println(bookDao.getById(1));
        //mp
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("123123");
        book.setName("123123");
        book.setDescription("123123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(15);
        book.setType("123123456");
        book.setName("123123456");
        book.setDescription("123123456");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(15);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
    }

    //列名称由自己决定具有一定风险性
    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "Spring");
        bookDao.selectList(qw);
    }

    //lambda表达式在语法级别进行检查
    @Test
    void testGetBy2() {
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        if (name != null) lqw.like(Book::getName, "Spring");
        lqw.like(Strings.isNotEmpty(name), Book::getName, "Spring");
        bookDao.selectList(lqw);
    }
}
