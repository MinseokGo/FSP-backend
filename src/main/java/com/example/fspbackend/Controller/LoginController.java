package com.example.fspbackend.Controller;

import com.example.fspbackend.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "rest/api/login")
@CrossOrigin(origins = "http://localhost:8080")
public class LoginController {
    @Autowired
    private LoginService logSvc;

    @PostMapping
    public void login(@RequestBody LoginDTO login) throws MemberNotFoundException, LoginFailedException {
        logSvc.loginCheck(login);
    }
}