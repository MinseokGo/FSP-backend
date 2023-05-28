package com.example.fspbackend.Controller;

import com.example.fspbackend.DTO.ToHomePageDTO;
import com.example.fspbackend.Service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "rest/api/home")
@CrossOrigin(origins = "http://localhost:8080")
public class HomePageController {
    @Autowired
    private HomePageService homeSvc;

    @GetMapping
    public List<ToHomePageDTO> home() {
        return homeSvc.homePageLoad();
    }
}
