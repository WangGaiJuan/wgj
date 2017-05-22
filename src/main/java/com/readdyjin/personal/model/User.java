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
    private short age;
    private String password;
    private String cellphone;

    public short getAge() {
        return age;
    }

    public User setAge(short age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getCellphone() {
        return cellphone;
    }

    public User setCellphone(String cellphone) {
        this.cellphone = cellphone;
        return this;
    }

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
