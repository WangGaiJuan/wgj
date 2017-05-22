package com.readdyjin.personal.dao;

import com.readdyjin.personal.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by weidijin on 17-5-22.
 *
 * @author weidijin
 * @version 1.0
 */
@Repository
public interface UserDao {

    int insert(User user);

    int update(User user);

    User selectUserByUserName(String userName);

    boolean userExist(String userName);

    List<User> selectAll();
}
