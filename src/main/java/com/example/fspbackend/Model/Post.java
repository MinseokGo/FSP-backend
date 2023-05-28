package com.example.fspbackend.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "post")
public class Post {
    @Id
    private String postID;
    private String postTitle;
    private String postContent;
    private String shareShop;
    private String shareTime;
    private String sharePlace;
    private String sharePeople;
}
