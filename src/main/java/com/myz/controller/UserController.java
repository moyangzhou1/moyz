package com.myz.controller;

import com.myz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @description: todo
 * @author: myz
 * @createtime: 2019/2/26$ 13:40$
 */
@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @Resource(name="userService")  // 获取spring配置文件中bean的id为userService的具体实现类，并注入
    private UserService userServiceImpl;//service层的用户接口类。

    @RequestMapping("helloworld")//该注解用来控制url书写时，具体方法的选择（还可以绑定参数等）
    public String helloworld() {
        System.out.print("用户姓名："+userServiceImpl.selectUserList());//调用接口方法获取用户姓名，打印用户姓名
        return "hello";//跳转到jsp页面
    }



}
