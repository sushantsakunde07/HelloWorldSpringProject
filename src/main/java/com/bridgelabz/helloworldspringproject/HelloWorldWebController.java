package com.bridgelabz.helloworldspringproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldWebController {
    @GetMapping("/web")
    public String hello() {
        return "hello.html";
    }

    @RequestMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello From Sushant");
        return "message.html";
    }
}