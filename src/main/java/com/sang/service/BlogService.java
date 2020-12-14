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

    public Result getCommunityAllBlogs(int page,int type){
        List<Blog> blogs = blogMapper.getCommunityAllBlogs((page-1)*Blog.onePageNumber,Blog.onePageNumber,type);
        return new Result(0,"success!!",blogs);
    }

    public Result getCommunityUserBlogs(int page,String username,int type){
        List<Blog> blogs = blogMapper.getCommunityUserBlogs((page-1)*Blog.onePageNumber,Blog.onePageNumber,username,type);
        return new Result(0,"success!!",blogs);
    }

    public Result getUserCenterAllBlogs(int page,int type,int visible,String username){
        List<Blog> blogs = blogMapper.getUserCenterAllBlogs((page-1)*Blog.onePageNumber,Blog.onePageNumber,type,visible,username);
        return Result.success(blogs);
    }
}
