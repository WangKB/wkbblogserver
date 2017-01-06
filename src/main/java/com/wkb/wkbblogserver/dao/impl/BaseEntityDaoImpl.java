package com.wkb.wkbblogserver.dao.impl;

import com.wkb.wkbblogserver.BaseSqlBuilder;
import com.wkb.wkbblogserver.dao.BaseEntityDao;
import com.wkb.wkbblogserver.entity.BaseEntity;

/**
 * Created by Administrator on 2017/1/6.
 */
public class BaseEntityDaoImpl<T extends BaseEntity> implements BaseEntityDao<T>{

    private BaseSqlBuilder baseSqlBuilder;

    @Override
    public T find(Long id) {
        return null;
    }

    @Override
    public T save(T obj) {
        baseSqlBuilder.selectById(obj.getClass());
        return null;
    }
}
