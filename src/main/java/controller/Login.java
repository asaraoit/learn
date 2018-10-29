package controller;


import org.springframework.web.bind.annotation.*;
import pojo.Audit;
import pojo.DatePojoTest;
import pojo.Person;
import pojo.UserMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * httpClient测试
 */

@RestController
public class Login {

    @RequestMapping("/login")
    @ResponseBody
    public String login(String name, String password) {

        return name + ":" + password;

    }

    @RequestMapping("/user/{Authorization}")
    public Map test(@PathVariable("Authorization") String Authorization, String s) {

        System.out.println("jjj:" + Authorization + "  s:" + s);

        UserMessage u = new UserMessage();
        u.setId("1");
        u.setName("Tom");
        u.setTelphone("123456");
        u.setMobile("22222");
        u.setOutEmail("1111");
        u.setInEmail("444");
        u.setFaxcode("44444");
        u.setSex("2");
        u.setRemark("au...");

        ArrayList<Map> maps = new ArrayList<>();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("kk", "vv");
        maps.add(objectObjectHashMap);

        HashMap<Object, Object> objectObjectHashMap2 = new HashMap<>();
        objectObjectHashMap2.put("kk", "vv");
        maps.add(objectObjectHashMap2);
        u.setAuthorities(maps);
        u.setUsername("ss");


        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("principal", u);
        return map;
    }

    @RequestMapping("/post")
    public void post(@RequestParam(value = "Authorization", required = false) String Authorization, @RequestBody Audit audit) {
        System.out.println("参数:" + Authorization);
        System.out.println(audit.getsUrl());


    }

    /**
     * modelAndAttribute
     */
    @RequestMapping("/maa")
    public void maa(@ModelAttribute Person person) {

        System.out.println(person.getSex() + person.getName());

    }

    /**
     * date接收测试
     *
     * @param datePojoTest
     */
    @RequestMapping("/date")
    public void date(@ModelAttribute DatePojoTest datePojoTest) {
        //解决方式:实体类字段上加注解
        //@DateTimeFormat(pattern = "yyyy-MM-dd")
        //private Date date;


        System.out.println("接收到的参数:" + datePojoTest);


    }


}

