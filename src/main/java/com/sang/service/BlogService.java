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

    public Result getUserCenterAllBlogs(int type,int visible,String username){
        List<Blog> blogs = blogMapper.getUserCenterAllBlogs(type,visible,username);
        return Result.success(blogs);
    }

    public Result addBlog(String id,String content,String username,int type,int visible,String description){
        if(blogMapper.addBlog(id,content,username,type,visible,description) == 1 )
            return new Result(0,"success!!",null);
        else
            return new Result(-1,"failure!!",null);
    }

    public Result deleteBlogById(String id){
        if(blogMapper.deleteBlogById(id) == 1)
            return new Result(0,"success!!",null);
        else
            return new Result(-1,"failure!!",null);
    }

    public Result updateBlogById(String id,String content,int type,int visible,String description){
        if(blogMapper.updateBlogById(id,content,type,visible,description) == 1)
            return new Result(0,"success!!",null);
        else
            return new Result(-1,"failure!!",null);
    }
}
