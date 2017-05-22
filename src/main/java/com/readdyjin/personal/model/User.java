package com.readdyjin.personal.model;

/**
 * Created by weidijin on 17-5-22.
 *
 * @author weidijin
 * @version 1.0
 */
public class User {
    private long id;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public long getId() {

        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "user: " +
                "id=[" + String.valueOf(this.id) + "]," +
                "userName=[" + this.userName + "]";
    }
}
