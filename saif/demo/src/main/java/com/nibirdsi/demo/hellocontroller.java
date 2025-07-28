package com.nibirdsi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class hellocontroller {
    @RequestMapping
    public String demo() {
        return "Hello, World!";
    }
}
