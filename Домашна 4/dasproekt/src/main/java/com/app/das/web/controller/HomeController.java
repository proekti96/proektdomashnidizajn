package com.app.das.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //Ovoj kontroler e povrzan so stranicata HOME.
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String homePage () {
        return "home";
    }
}