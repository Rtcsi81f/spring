package edu.zjnu.biz.controller;

import edu.zjnu.biz.entity.Book;
import edu.zjnu.biz.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 杨海波
 * @date: 2023-01-09 14:32:21
 * @description: TransactionController
 */
@RequestMapping("/transaction")
@Controller
public class TransactionController {

    @Autowired
    @Qualifier("bookService")
    private IBookService bookService;

    @RequestMapping("/test")
    public String test(Model model) {
        Book book = bookService.getBookById(1L);
        model.addAttribute("result", book.toString());
        return "result";
    }

}
