package com.caelesits.controller;

import com.caelesits.domain.Book;
import com.caelesits.service.IBookService;
import com.caelesits.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Caelesits
 * @create 2022/6/8 18:03
 **/
@RestController
@RequestMapping("/books")
public class BookController {

    @Resource
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(bookService.insert(book));
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {

        return new R(true, bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, bookService.getPage(currentPage, pageSize));

    }

}
