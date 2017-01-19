package com.wkb.wkbblogserver;

import com.wkb.wkbblogserver.entity.BaseEntity;

import org.apache.ibatis.jdbc.SQL;

import javax.persistence.Column;
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

    public String insert(BaseEntity obj){
        return new SQL(){{
            INSERT_INTO(obj.getClass().getAnnotation(Column.class).name());
        }}.toString();
    }

    public String update(BaseEntity obj){
        return new SQL(){{
            UPDATE(obj.getClass().getAnnotation(Column.class).name());
            SET("FIRST_NAME = #{firstName}");
            WHERE("ID = #{id}");
        }}.toString();
    }

    public String delete(BaseEntity obj){
        return new SQL(){{
            DELETE_FROM(obj.getClass().getAnnotation(Column.class).name());
            WHERE("ID = #{id}");
        }}.toString();
    }
}
