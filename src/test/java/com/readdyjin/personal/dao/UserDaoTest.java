package com.readdyjin.personal.dao;


import com.readdyjin.personal.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by weidijin on 17-5-22.
 *
 * @author weidijin
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/application.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    private User user = new User()
            .setUserName("test")
            .setPassword("pass")
            .setCellphone("21343498124")
            .setAge((short)20);

    @Test
    public void insertUserTest() throws Exception {
        System.out.println("insert " + user);
        System.out.println("affected rows: " + userDao.insert(user));
    }

    @Test
    public void selectUserByUserNameTest() throws Exception {
        user = userDao.selectUserByUserName("test");
        System.out.println("select " + user);
    }
}