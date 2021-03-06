package com.sang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.po.Blog;
import com.sang.service.BlogService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    ObjectMapper mapper = new ObjectMapper();
    String json;
    Result result;

    @RequestMapping("/community/allBlogs")
    public String getCommunityAllBlogs(int page,int type) throws JsonProcessingException {
        try{
            result = blogService.getCommunityAllBlogs(page,type);

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    @RequestMapping("/community/userBlogs")
    public String getCommunityUserBlogs(int page,String username,int type) throws JsonProcessingException {
        try{
            result = blogService.getCommunityUserBlogs(page,username,type);

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    @RequestMapping("userCenter/allBlogs")
    public String getUserCenterAllBlogs(int page, int type, int visible, HttpSession session) throws JsonProcessingException {
        try{
            String username = (String)session.getAttribute("username");
            System.out.print("sfsd"+username);
            result = blogService.getUserCenterAllBlogs(page,type,visible,username);

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

}
