package com.sang.service;

import com.sang.mapper.BlogMapper;
import com.sang.po.Blog;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogMapper blogMapper;

    public Result getBlogByPage(int page){
        List<Blog> blogs = blogMapper.getBlogsByPage((page-1)*Blog.onePageNumber,Blog.onePageNumber);
        return new Result(0,"success!!",blogs);
    }
}
