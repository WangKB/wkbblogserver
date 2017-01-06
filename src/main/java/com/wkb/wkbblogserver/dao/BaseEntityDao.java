package com.wkb.wkbblogserver.dao;

import com.wkb.wkbblogserver.entity.BaseEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 79987 on 2017/1/5.
 */
@Mapper
public interface BaseEntityDao<T extends BaseEntity> {

    T find(Long id);

    T save(T obj);
}
