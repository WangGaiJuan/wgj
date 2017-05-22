package com.readdyjin.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by weidi.jin on 17-5-14.
 *
 * @author weidi.jin
 * @version 1.0
 */
@SuppressWarnings("unused")
@Controller
public class IndexController {

//    @RequestMapping(value = {"/", "/index.html"}, method = RequestMethod.GET)
//    public ModelAndView index() {
//        ModelAndView mav = new ModelAndView("index");
//        return mav;
//    }

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public ModelAndView test() {
        return new ModelAndView("test");
    }

    @RequestMapping(value = {"/addidea.html"}, method = RequestMethod.GET)
    public ModelAndView addIdea() {
        return new ModelAndView("addidea");
    }
}
