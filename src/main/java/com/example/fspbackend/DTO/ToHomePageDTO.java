package com.example.fspbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@AllArgsConstructor
public class ToHomePageDTO {
    //private String address;
    private String title;
    private String place;
    private String time;
    private String people;
    private String shopImg;
}
