package com.app.das.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/ProCredit")
public class ProCreditController {
    @GetMapping
    public String banksPage (Model model) {
        return "ProCredit";
    }
}