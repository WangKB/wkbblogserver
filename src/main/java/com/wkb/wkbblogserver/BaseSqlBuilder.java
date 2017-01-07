package com.wkb.wkbblogserver;

import com.wkb.wkbblogserver.entity.BaseEntity;

import org.apache.ibatis.jdbc.SQL;

import javax.persistence.Table;

;

/**
 * Created by Administrator on 2017/1/6.
 */
public class BaseSqlBuilder {

    public String selectById(Long id,BaseEntity obj){
        return new SQL(){{
            SELECT("*");
            FROM(obj.getClass().getAnnotation(Table.class).name());
        }}.toString();
    }
}
