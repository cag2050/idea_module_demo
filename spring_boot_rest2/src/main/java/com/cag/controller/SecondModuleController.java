package com.cag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondModuleController {

    @GetMapping("/module")
    public String test() {
        return "第二个 module：test restful api";
    }
}
