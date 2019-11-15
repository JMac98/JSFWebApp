package com.sparta.jmac.beans;


import com.sparta.jmac.components.User;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class UserBeanManager {

    @Transactional
    public void setUsersDetails(EntityManager entityManager, User user){
        entityManager.persist(user);
    }
}
