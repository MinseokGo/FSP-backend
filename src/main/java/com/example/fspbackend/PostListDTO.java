package com.example.fspbackend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostListDTO {
    private String title;
    private String place;
    private String time;
    private String people;
}
