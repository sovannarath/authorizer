package com.authorizer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DefaultController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, this the default controller!";
    }

}
