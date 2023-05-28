package com.example.fspbackend.Controller;

import com.example.fspbackend.DTO.PostDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rest/api/post")
@CrossOrigin(origins = "http://localhost:8080")

public class WritePostController {
    @PostMapping
    public void post(@RequestBody PostDTO postDTO) {
        System.out.println(postDTO.getTitle() + postDTO.getContent() + postDTO.getMenu() +
                postDTO.getTime() + postDTO.getPlace() + postDTO.getPeople());
    }
}
