/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.entity;

/**
 *
 * @author Jose Osuna
 */
public class RequestProfile {

    private String id;

    public RequestProfile() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RequestProfile{" + "id=" + id + '}';
    }

}
