package edu.zjnu.biz.controller;

import edu.zjnu.biz.entity.User;
import edu.zjnu.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 描述
 * @author: 杨海波
 * @date: 2022-01-29
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(Model model) {
        User user = new User();
        user.setName("小瘪三");
        user.setAge(17);
        model.addAttribute("user", user);
        userService.doSomeThing();
        return "user";
    }
}
