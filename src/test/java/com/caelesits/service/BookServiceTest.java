package com.caelesits.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author Caelesits

 * @create 2022/6/7 21:52
 **/
@SpringBootTest
public class BookServiceTest {

    @Resource
    private IBookService bookService;

    @Test
    void testGetById(){
        bookService.getById(4);
    }
}
