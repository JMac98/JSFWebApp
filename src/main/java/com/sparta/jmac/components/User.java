package com.sparta.jmac.components;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="username")
    private String userName;

    @Column(name="first_name")
    private String firstName;

    @Column(name="surname")
    private String surName;

    @Column(name="user_password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
