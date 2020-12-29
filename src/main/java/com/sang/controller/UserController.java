package com.sang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.service.UserService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;

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
        int result = 0;
        String json="";
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            result = userService.insert(username,new BCryptPasswordEncoder().encode(password));
        }catch (Exception e){
            //捕获主键异常
            if(e.getCause() instanceof SQLIntegrityConstraintViolationException)
                json = objectMapper.writeValueAsString(new Result(1,"用户名重复",null));
            //用户名过长
            else if(username.length()>20)
                json = objectMapper.writeValueAsString(new Result(1,"用户名超过指定长度",null));
            //密码过长
            else if(password.length()>200)
                json = objectMapper.writeValueAsString(new Result(1,"密码超过指定长度",null));
        }
        if(result == 1){
            //插入成功
            json = objectMapper.writeValueAsString(new Result(0,"success!!",null));
        }
        return json;
    }

    /**
     * 登录接口 /login 直接调用
     */


}
