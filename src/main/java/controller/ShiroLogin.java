package controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;
import utils.MD5Util;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("pre")
public class ShiroLogin {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String loginpage() {


        return "/page/pre_authorcation/login";
    }


    @RequestMapping("check")
    public String login(String name, String password) {

        System.out.println("----------login-------------");

        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(name, password);

        System.out.println("token : " + token);


        return null;
    }

    @RequestMapping("register")
    public String register() {


        return "/pre/register";
    }

    @RequestMapping("insert")
    public String insert(String name, String password, String phone, String email) {

        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        user.setPassword(MD5Util.getPwd(password));
        user.setPhone(phone);
        user.setEmail(email);
        user.setCreateTime(new Date());
        user.setUpdateTima(new Date());

        userService.register(user);


        return "/index";
    }

}
