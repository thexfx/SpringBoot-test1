package com.test.demo.controller;


import com.test.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author thexfx
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @GetMapping(value="/findall")
    public Object findall(){
        return bookService.findall();
    }


}
