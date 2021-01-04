package com.sang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.po.Blog;
import com.sang.pojo.Infos;
import com.sang.service.BlogService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    public String getCommunityAllBlogs(@RequestBody Infos infos) throws JsonProcessingException {
        try{
            result = blogService.getCommunityAllBlogs(infos.getType(), infos.getPage());

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    @RequestMapping("/community/userBlogs")
    public String getCommunityUserBlogs(@RequestBody Infos infos) throws JsonProcessingException {
        try{
            result = blogService.getCommunityUserBlogs(infos.getPage(),infos.getUsername(),infos.getType());

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    @RequestMapping("userCenter/allBlogs")
    public String getUserCenterAllBlogs(@RequestBody Infos infos, HttpSession session) throws JsonProcessingException {
        try{
            String username = (String)session.getAttribute("username");
            result = blogService.getUserCenterAllBlogs(infos.getType(),infos.getVisible(),username);

        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    //个人中心添加博客
    @RequestMapping("userCenter/addBlog")
    public String addBlog(@RequestBody Infos infos,HttpSession session) throws JsonProcessingException {
        try{
            String username = (String)session.getAttribute("username");
            result = blogService.addBlog(infos.getId(),infos.getContent(),username,infos.getType(),infos.getVisible(),infos.getDescription());
        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    //个人中心删除博客
    @RequestMapping("userCenter/deleteBlog")
    public String deleteBlogById(@RequestBody Infos infos) throws JsonProcessingException {
        try{
            result = blogService.deleteBlogById(infos.getId());
        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }

    //个人中心修改博客
    @RequestMapping("userCenter/updateBlog")
    public String updateBlogById(@RequestBody Infos infos) throws JsonProcessingException {
        try{
            result = blogService.updateBlogById(infos.getId(),infos.getContent(),infos.getType(),infos.getVisible(),infos.getDescription());
        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }
}
