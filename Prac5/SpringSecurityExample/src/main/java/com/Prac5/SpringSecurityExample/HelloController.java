package com.Prac5.SpringSecurityExample;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String  greet(HttpServletRequest request){
        return "THis is my home page -> Session ID" + request.getSession().getId();
    }
}
