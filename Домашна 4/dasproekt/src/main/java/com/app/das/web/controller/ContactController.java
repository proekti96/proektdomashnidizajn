package com.app.das.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //Ovoj kontroler e povrzan so stranicata CONTACT.
@RequestMapping("/contact")
public class ContactController {
    @GetMapping
    public String banksPage (Model model) {
        return "contact";
    }
}