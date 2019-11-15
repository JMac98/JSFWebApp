package com.sparta.jmac.beans;

import com.sparta.jmac.components.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceStarter {

    public void runPersistence(User user){
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("Employees");

        EntityManager entityManager = managerFactory.createEntityManager();

        UserBeanManager userBeanManager = new UserBeanManager();

        userBeanManager.setUsersDetails(entityManager, user);

    }
}
