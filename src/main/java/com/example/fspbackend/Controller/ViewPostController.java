package com.example.fspbackend.Controller;

import com.example.fspbackend.DTO.testDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rest/api/view")
@CrossOrigin(origins = "http://localhost:8080")
public class ViewPostController {
    @PostMapping
    public void post(@RequestParam(required = false, value = "not parameter") String id) {
        System.out.println(id);
    }
}