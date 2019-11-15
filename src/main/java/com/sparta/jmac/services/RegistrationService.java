package com.sparta.jmac.services;

import com.sparta.jmac.beans.PersistenceStarter;
import com.sparta.jmac.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@Stateless
public class RegistrationService {

    @PersistenceContext
    EntityManager entityManager;

    public String registerUser(User user) {
        PersistenceStarter persistenceStarter = new PersistenceStarter();
        persistenceStarter.runPersistence(user);

        return "welcome";
    }
}


//        if (user.getUserName().isEmpty() || user.getPassword().isEmpty() || user.getFirstName().isEmpty() || user.getSurName().isEmpty() ) {
//                return null;
//                } else{
//                return "welcome";
//                }