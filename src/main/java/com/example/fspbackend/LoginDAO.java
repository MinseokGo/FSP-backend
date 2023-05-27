package com.example.fspbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    public User selectUser(String id) {
        Query query = new Query(Criteria.where("userId").is(id));
        List<User> userList = mongoTemplate.find(query, User.class);

        return userList.get(0);
    }
}