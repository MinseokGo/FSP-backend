package com.example.fspbackend.DAO;

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

    public List<Post> selectAllPost() {
        Query query = new Query(Criteria.where("postTitle").is("노나묵자현"));
        List<Post> postList = mongoTemplate.find(query, Post.class);
        if(postList.size() <= 0) {
            System.out.println("Not exist post!!");

            return null;
        }

        return postList;
    }

    //게시물 클릭 시 게시물 정보 메서드 구현//
}
