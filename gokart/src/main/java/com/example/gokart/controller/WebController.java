package com.example.gokart.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class WebController {

    @GetMapping("/form")
    public String getForm() {
        log.info("Accessing form.html");
        return "form";
    }

    @GetMapping("/index")
    public String getIndex() {
        log.info("Accessing index.html");
        return "index";
    }

    @GetMapping("/kart")
    public String getKart() {
        log.info("Accessing kart.html");
        return "kart";
    }
}
