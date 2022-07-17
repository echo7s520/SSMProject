package com.xx.ssm.controller;

//import com.xx.ssm.common.ResponseResult;
import com.xx.ssm.domain.User;
import com.xx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
//@ResponseBody
//@RestController
public class UserController {
    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user    GET     查询所有用户信息
     * /user/1    GET     根据用户id查询用户信息
     * /user    POST     添加用户信息
     * /user/1    DELETE     删除用户信息
     * /user    PUT     修改用户信息
     */

    @Autowired
    private UserService userService;

    //查询所有用户
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String findAll(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("users",all);
        return "UserList";
        //return new ResponseResult(200,"操作成功",all);
    }

    //添加用户信息
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(User user){
        userService.insertUser(user);
        return "redirect:/user";
    }

    //删除用户信息
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "redirect:/user";
    }

    //根据指定 ID 进行查询数据  修改数据时进行查询用
    @GetMapping("/user/{id}")
    public String findById(@PathVariable("id") Integer id,Model model){
        User user = userService.findById(id);
        model.addAttribute("userId",user);
        return "UserUpdate";
    }

    //修改用户信息
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/user";
    }

}
