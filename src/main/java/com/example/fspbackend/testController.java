package com.example.fspbackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backend/api/auth")
@CrossOrigin(origins = "http://localhost:8080")
public class testController {
    @GetMapping("/juna")
    public void test() {
        System.out.println("sex");
    }
}
