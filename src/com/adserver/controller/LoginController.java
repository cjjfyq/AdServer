package com.adserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Gordon on 2014/4/14.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginPage(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("进入 show login page---");
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("进入 do login -----");
        return "success";
    }

}
