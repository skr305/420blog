package com.sang.mapper;

import com.sang.po.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BlogMapper {
    List<Blog> getBlogsByPage(@Param("firstOne") int firstOne,@Param("number") int number);
}
