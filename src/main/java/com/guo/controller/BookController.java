package com.guo.controller;

import com.guo.pojo.Books;
import com.guo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

// 查询全部的书记，并且返回到一个书籍展示页面
    @GetMapping("/allBook")
    public String allBook(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

//   跳转到增加书籍页面
    @GetMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("books=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
        // return "allBook";
    }

    @GetMapping("/toUpdateBook")
    public String toUpdate(int id, Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("book", book);

        return "updateBook";
    }

    @PostMapping("/updateBook")
    public String updateBook(Books book) {
        System.out.println("book=>" + book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @GetMapping("/delBook/{bookId}")
    public String delBook(@PathVariable("bookId")int id) {
        bookService.delBook(id);
        return "redirect:/book/allBook";
    }

    @PostMapping("/queryBookByName")
    public String queryBookByName(String queryBookName, Model model) {
        String name = "%" + queryBookName + "%";
        List<Books> list = bookService.queryBookByName(name);
        model.addAttribute("list", list);

        return "allBook";
    }
}
