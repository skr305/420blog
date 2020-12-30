package com.sang.mapper;

import com.sang.po.Blog;
import org.apache.ibatis.annotations.*;
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

    //上传博客
    @Insert("insert into blogs(id,content,username,type,visible,description) value(#{id},#{content},#{username},#{type},#{visible},#{description})")
    int addBlog(String id,String content,String username,int type,int visible,String description);

    //删除博客
    @Delete("delete from blogs where id = #{id}")
    int deleteBlogById(String id);

    //修改博客内容
    @Update("update blogs set content = #{content},type = #{type},visible = #{visible},description = #{description} where id = #{id}")
    int updateBlogById(String id,String content,int type,int visible,String description);

}
