package com.wkb.wkbblogserver.dao;

import com.wkb.wkbblogserver.BaseSqlBuilder;
import com.wkb.wkbblogserver.entity.Article;
import com.wkb.wkbblogserver.entity.BaseEntity;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by 79987 on 2017/1/5.
 */
@Mapper
public interface BaseEntityMapper<T extends BaseEntity>  extends tk.mybatis.mapper.common.Mapper<Article> {

    @SelectProvider(type = BaseSqlBuilder.class,method = "selectById")
    T find(Long id,T obj);

    @InsertProvider(type = BaseSqlBuilder.class,method = "insert")
    T save(T obj);

    @UpdateProvider(type = BaseSqlBuilder.class,method = "update")
    T update(T obj);

    @DeleteProvider(type = BaseSqlBuilder.class,method = "delete")
    void delete(T obj);

}
