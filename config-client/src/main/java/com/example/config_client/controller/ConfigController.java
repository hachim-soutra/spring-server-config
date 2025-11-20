package com.example.config_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/message")
@Slf4j
public class ConfigController {

    @GetMapping("")
    public String getMessageString() {
        return "Hello world";
    }
    
}
