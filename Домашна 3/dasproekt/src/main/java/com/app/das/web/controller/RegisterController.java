package com.app.das.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/register")
public class RegisterController
{
        private List<String> allowedNames;
        @PostConstruct
        public void init() {
            this.allowedNames = new ArrayList<>();
            this.allowedNames.add("user");
        }
        @GetMapping
        public String getLoginPage() {
            return "register";
        }
        @PostMapping
        public String loginUser(HttpServletRequest req) {
            String username = req.getParameter("username");
            if (username != null && this.allowedNames.contains(username)) {
                req.getSession().setAttribute("username", username);
                return "redirect:/home";
            } else {
                return "redirect:/register";
            }
        }
    }