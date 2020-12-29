package com.sang.mapper;

import com.sang.po.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BlogMapper {
    List<Blog> getCommunityAllBlogs(@Param("firstOne") int firstOne,@Param("number") int number,@Param("type") int type);

    List<Blog> getCommunityUserBlogs(@Param("firstOne") int firstOne,@Param("number") int number,@Param("username") String username,@Param("type") int type);

    List<Blog> getUserCenterAllBlogs(@Param("type") int type, @Param("visible") int visible,
                                     @Param("username") String username);
}
