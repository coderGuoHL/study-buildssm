package com.guo.service;

import com.guo.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //    1.增加一本图书
    int addBook(Books books);
    //    2.删除一本书
    int delBook(@Param("bookId") int id);
    //    3.更新一本书
    int updateBook(Books books);
    //    4.查询一本书
    Books queryBookById(@Param("bookId")int id);
    //    查询全部的书
    List<Books> queryAllBook();

}
