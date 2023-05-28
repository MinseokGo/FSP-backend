package com.example.fspbackend.DAO;

import com.example.fspbackend.Exception.PostNotFoundException;
import com.example.fspbackend.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    public List<Post> selectAllPost() throws PostNotFoundException {
        Query query = new Query();
        List<Post> postList = mongoTemplate.find(query, Post.class);
        if(postList.size() <= 0) {
            System.out.println("Not exist post!!");

            throw new PostNotFoundException();
        }

        return postList;
    }

    //게시물 클릭 시 게시물 정보 메서드 구현//
}
