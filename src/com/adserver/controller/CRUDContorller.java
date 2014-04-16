package com.adserver.controller;

import com.adserver.web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/4/16.
 * 对管理员进行增删改查
 */
@Controller
@RequestMapping("/user")
public class CRUDContorller {



    @RequestMapping("/addUser")
    public String addUser(User manager) {
        System.out.println("进入 addUser-----");
        System.out.println("manager: " + manager);

        return "success";
    }

}
