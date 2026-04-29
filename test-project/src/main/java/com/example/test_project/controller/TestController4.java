package com.example.test_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController4 {

        @GetMapping("/test4")
        public String hello() {
            return "Hello World";
        }

}
