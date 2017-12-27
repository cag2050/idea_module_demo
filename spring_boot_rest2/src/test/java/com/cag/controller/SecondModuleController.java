package com.cag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondModuleController {

    @GetMapping("/test")
    public String test() {
        return "第一个 module：test restful api";
    }
}
