package com.example.fspbackend.Controller;

import com.example.fspbackend.DTO.LoginDTO;
import com.example.fspbackend.Exception.LoginFailedException;
import com.example.fspbackend.Exception.MemberNotFoundException;
import com.example.fspbackend.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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