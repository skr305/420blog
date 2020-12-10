package com.sang.controller;

import com.sang.po.Blog;
import com.sang.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/index")
    public List<Blog> getBlogByPage(int page){
        List<Blog> blogs = blogService.getBlogByPage(page);
        return blogs;
    }


}
