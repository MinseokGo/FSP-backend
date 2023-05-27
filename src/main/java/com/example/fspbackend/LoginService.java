package com.example.fspbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDAO loginDAO;

    public boolean loginCheck(LoginDTO login) throws MemberNotFoundException, LoginFailedException {
        User user = loginDAO.selectUser(login.getId());

        if(user == null) {
            System.out.println("Not exist User!!");
            throw new MemberNotFoundException();
        }

        if(login.getPassword().equals(user.getPassword())) {
            System.out.println("Login Success!!");
            return true;
        } else {
            System.out.println("Login Failed");
            throw new LoginFailedException();
        }
    }
}