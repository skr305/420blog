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
    public String getUserCenterAllBlogs(int type, int visible, HttpSession session) throws JsonProcessingException {
        try{
            String username = (String)session.getAttribute("username");
            result = blogService.getUserCenterAllBlogs(type,visible,username);

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
    public String addBlog(String id,String content,int type,int visible,String description,HttpSession session) throws JsonProcessingException {
        try{
            String username = (String)session.getAttribute("username");
            result = blogService.addBlog(id,content,username,type,visible,description);
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
    public String deleteBlogById(String id) throws JsonProcessingException {
        try{
            result = blogService.deleteBlogById(id);
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
    public String updateBlogById(String id,String content,int type,int visible,String description) throws JsonProcessingException {
        try{
            result = blogService.updateBlogById(id,content,type,visible,description);
        }catch (Exception e){
            result = new Result(-1,"服务器错误",null);
        }
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        json = mapper.writeValueAsString(result);

        return json;
    }
}
