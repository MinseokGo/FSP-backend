package com.example.fspbackend.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rest/api/view")
@CrossOrigin(origins = "http://localhost:8080")
public class ViewPostController {
    @PostMapping
    public void post(@RequestParam String id) {
        System.out.println(id);
    }
}