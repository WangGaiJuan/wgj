package com.readdyjin.personal.controller;

import com.readdyjin.personal.model.ResponseObject;
import com.readdyjin.personal.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.readdyjin.personal.service.IUserService;

/**
 * Created by weidijin on 17-5-22.
 *
 * @author weidijin
 * @version 1.0
 */
@SuppressWarnings("unused")
@Controller
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    /**
     * 处理用户注册
     */
    @RequestMapping(value = "/user/register.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject register(@RequestBody User user) {
        ResponseObject responseObject = new ResponseObject();

        LOGGER.info("请求注册用户: " + user);

        int affectedRows = userService.Registration(user);

        return responseObject
                .setStatus(0)
                .setMsg("success");
    }

    /**
     * 处理用户登录
     */
    @RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject login(@RequestBody User user) {
        ResponseObject responseObject = new ResponseObject().initCommonFailureStatus();

        userService.Authencication();

        return responseObject;
    }
}
