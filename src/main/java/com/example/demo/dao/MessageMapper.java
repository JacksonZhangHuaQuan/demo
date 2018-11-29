package com.example.demo.dao;

import com.example.demo.entity.Message;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MessageMapper {

    @Delete("DELETE FROM message WHERE id = #{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("INSERT INTO message (id,name,msg,createtime) values ( #{id},#{name},#{msg},#{createtime})")
    int insert(Message record);

    @Select("SELECT * FROM message WHERE id = #{id}")
    Message selectByPrimaryKey(Integer id);

    @Select("SELECT * FROM message ")
    List<Message> selectAll();

    @Update("UPDATE user SET id = #{id}, name = #{msg}, password = #{msg}," +
            "createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKey(Message record);
}