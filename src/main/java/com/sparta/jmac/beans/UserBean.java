package com.sparta.jmac.beans;

import com.sparta.jmac.components.User;
import com.sparta.jmac.services.LoginService;
import com.sparta.jmac.services.RegistrationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {

    @Inject
    private RegistrationService registrationService = new RegistrationService();

    @Inject
    private LoginService loginService = new LoginService();

    private User user = new User();

    public String registerNewUser(){
        return registrationService.registerUser(user);
    }

    public User getUser() {
        return user;
    }

    public String validateUser(){
        return loginService.validateUser(user);
    }


}
