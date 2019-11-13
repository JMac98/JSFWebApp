package com.sparta.jmac.services;

import com.sparta.jmac.components.User;

public class LoginService {
    public String validateUser(User user) {
        if (user.getUserName() != "James" && user.getPassword().matches("[0-9]+")) {
            return "welcome";
        } else{
            return "login";
        }
    }

}

//if (user.getFirstName().matches("[a-zA-Z]+") && user.getSurName().matches("[a-zA-Z]+")) {
