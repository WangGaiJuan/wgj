package com.readdyjin.personal.service;


import com.readdyjin.personal.model.User;

/**
 * Created by weidi.jin on 17-5-22.
 *
 * @author weidi.jin
 * @version 1.0
 */
public interface IUserService {

    /**
     * 用户注册
     */
    int Registration(User user);

    /**
     * 用户认证
     */
    boolean Authencication(String userName, String password);
}
