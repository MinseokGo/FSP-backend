package com.example.fspbackend.Controller;

import com.example.fspbackend.DTO.ToHomePageDTO;
import com.example.fspbackend.Exception.PostNotFoundException;
import com.example.fspbackend.Exception.ToHomePageDTOException;
import com.example.fspbackend.Service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rest/api/home")
@CrossOrigin(origins = "http://localhost:8080")
public class HomePageController {
    @Autowired
    private HomePageService homeSvc;

    @GetMapping
    public List<ToHomePageDTO> home() throws PostNotFoundException, ToHomePageDTOException {
        return homeSvc.homePageLoad();
    }
}
