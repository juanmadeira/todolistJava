package io.github.juanmadeira.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")

public class controller {
    @GetMapping("/")
    public String message() {
        return "teste";
    }
}