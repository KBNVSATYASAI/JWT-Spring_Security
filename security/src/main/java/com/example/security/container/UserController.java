package com.example.security.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class UserController {

@GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "I hope you guys are doing well "+request.getSession().getId();
    }

}
