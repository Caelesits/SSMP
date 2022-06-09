package com.caelesits.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caelesits.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//mp
public interface BookDao extends BaseMapper<Book> {
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);


}
