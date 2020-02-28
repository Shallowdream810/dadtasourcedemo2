package com.ghh.datasourcedemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private DataSource dataSource;


    @RequestMapping("/va")
    private String getdat(){
        return "123";
    }


}
