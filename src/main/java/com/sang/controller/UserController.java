package com.sang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.po.User;
import com.sang.service.UserService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 注册接口
     */
    @PostMapping(value = {"/register"})
    @ResponseBody
    public String register(String username,String password) throws JsonProcessingException {
        if(userService.insert(username,new BCryptPasswordEncoder().encode(password)) == 1){
           //插入成功
           String json="";
           ObjectMapper objectMapper = new ObjectMapper();
           json = objectMapper.writeValueAsString(new Result(0,"success!!",null));
           return json;
        }else {
            //插入失败
            String json="";
            ObjectMapper objectMapper = new ObjectMapper();
            json = objectMapper.writeValueAsString(Result.fail("注册失败",null));
            return json;
        }
    }

    /**
     * 登录接口 /login 直接调用
     */


}
