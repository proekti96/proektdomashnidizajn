package com.app.das.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/all")
public class AllController {
    @GetMapping
    public String banksPage (Model model) {
        return "all";
    }
}