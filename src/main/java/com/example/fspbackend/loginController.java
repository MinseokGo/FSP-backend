package com.example.fspbackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;

@RestController
@RequestMapping(value = "rest/api/login")
@CrossOrigin(origins = "http://localhost:8080")
public class loginController {
    @PostMapping
    public void login(HttpServlet req) {
        System.out.println(req.getInitParameter("id") + ", " + req.getInitParameter("password"));
    }
}
