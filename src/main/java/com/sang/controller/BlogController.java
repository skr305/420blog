package com.sang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.po.Blog;
import com.sang.service.BlogService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/index")
    public String getBlogByPage(int page) throws JsonProcessingException {
        Result result = blogService.getBlogByPage(page);
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(result);

        return json;
    }


}
