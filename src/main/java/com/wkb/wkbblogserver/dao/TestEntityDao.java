package com.wkb.wkbblogserver.dao;

import com.wkb.wkbblogserver.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 79987 on 2017/1/5.
 */
@Mapper
public interface TestEntityDao {

    @Select("select * from user where name = #{name}")
    TestEntity findUserByName(@Param("name")String name);
}
