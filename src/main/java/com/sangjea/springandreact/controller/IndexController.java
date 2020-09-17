package com.sangjea.springandreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    @GetMapping("/api/index")
    public String index() {
        return "현재 시각: " + new Date();
    }
}
