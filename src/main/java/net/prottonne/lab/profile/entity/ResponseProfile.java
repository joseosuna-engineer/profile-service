/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.entity;

/**
 *
 * @author Jose Osuna
 */
public class ResponseProfile {

    private User user;

    public ResponseProfile() {
        super();
    }

    public ResponseProfile(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ResponseProfile{" + "user=" + user + '}';
    }

}
