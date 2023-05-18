package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingConteroller {

    @GetMapping("/ping")
    public String pingapi() {
        return "Ping Success!";
    }

}
