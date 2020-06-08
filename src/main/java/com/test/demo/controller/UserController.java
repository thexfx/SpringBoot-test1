package com.test.demo.controller;

import com.test.demo.service.USERservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user",produces = { "application/json;charset=UTF-8" })
public class UserController {

    @Autowired
    USERservice userService;
    @GetMapping(value="/all")
    public Object all() {
        return userService.all();
    }


}
