package com.sang.service;

import com.sang.mapper.BlogMapper;
import com.sang.po.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogMapper blogMapper;

    public List<Blog> getBlogByPage(int page){
        return blogMapper.getBlogsByPage((page-1)*Blog.onePageNumber,Blog.onePageNumber);
    }
}
