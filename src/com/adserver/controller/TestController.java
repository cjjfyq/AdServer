package com.adserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Gordon on 2014/4/14.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/showpage")
    public String showPage(HttpServletRequest request) {
        System.out.println("进入 showpage方法----");
        return "test";
    }

}
