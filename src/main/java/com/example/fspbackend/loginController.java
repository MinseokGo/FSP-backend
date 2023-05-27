package com.example.fspbackend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "rest/api/login")
public class loginController {
    @PostMapping
    public void login(String id, String password) {
        System.out.println(id + ", " + password);
    }
}
