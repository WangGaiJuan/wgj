package com.readdyjin.personal.service.impl;

import com.google.common.base.Preconditions;
import com.readdyjin.personal.dao.UserDao;
import com.readdyjin.personal.model.User;
import com.readdyjin.personal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weidijin on 17-5-22.
 *
 * @author weidijin
 * @version 1.0
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserDao userDao;

    /**
     * 用户注册
     */
    public int Registration(User user) {
        Preconditions.checkArgument(
                null != user,
                "参数错误: user is null"
        );
        return userDao.insert(user);
    }

    /**
     * 用户认证
     */
    public boolean Authencication() {
        return true;
    }
}
