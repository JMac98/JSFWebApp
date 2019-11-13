package com.sparta.jmac.services;

import com.sparta.jmac.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless
public class RegistrationService {
    public String registerUser(User user) {
        if (user.getUserName().isEmpty() || user.getPassword().isEmpty() || user.getUserName().isEmpty() || user.getPassword().isEmpty() ) {
            return null;
        } else{
            return "welcome";
        }
    }
}
