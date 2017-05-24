package com.readdyjin.personal.controller;

import com.readdyjin.personal.model.ResponseObject;
import com.readdyjin.personal.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
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

    private static final int VALID_REGISTRATION_CODE = 1;

    @Autowired
    private IUserService userService;

    /**
     * 处理用户注册
     */
    @RequestMapping(value = "/user/register.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject register(@RequestBody User user) {
        LOGGER.info("请求注册用户: " + user);

        ResponseObject responseObject = new ResponseObject().initCommonFailureStatus();
        int affectedRows = userService.Registration(user);
        if (VALID_REGISTRATION_CODE != affectedRows) {
            return responseObject;
        }

        return responseObject
                .setStatus(0)
                .setMsg("success");
    }

    /**
     * 处理用户登录
     */
    @RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject login(@RequestParam String userName,
                                @RequestParam String password) {
        ResponseObject responseObject = new ResponseObject().initCommonFailureStatus();

        userService.Authencication(userName, password);

        return responseObject;
    }
}
