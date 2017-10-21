package com.Fan;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Fan on 17/10/21.
 */

public interface DemoMapper{
    @Select("select * from Demo where name=#{name}")
    public List<Demo> likeName(String name);

    @Select("select * from Demo where id=#{id}")
    public Demo getById(int id);

    @Select("select name from Demo where id=#{id}")
    public String getNameById(int id);
}

