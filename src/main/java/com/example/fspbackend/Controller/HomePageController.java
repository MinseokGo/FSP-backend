package com.example.fspbackend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fspbackend.PostListDTO;

@RestController
@RequestMapping(value = "rest/api/home")
@CrossOrigin(origins = "http://localhost:8080")
public class HomePageController {
    @GetMapping
    public PostListDTO post() {
        return new PostListDTO("노나묵자", "장전초", "19시", "2명");
    }
}
