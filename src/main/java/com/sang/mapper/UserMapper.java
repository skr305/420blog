package com.sang.mapper;

import com.sang.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into user_password(username,password) value(#{username},#{password})")
    int insert(String username,String password);

    @Delete("delete from user_password where username = #{username}")
    int deleteByName(String username);

    @Update("update user_password set username = #{username},password = #{password} where username = #{username}")
    int updateByName(String username,String password);

    @Select("select username,password from user_password where username=#{username}")
    User loadUserByUsername(@Param("username") String username);
}
