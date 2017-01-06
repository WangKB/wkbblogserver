package com.wkb.wkbblogserver;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/1/6.
 */
@Component
public class BaseSqlBuilder {

    public String selectById(Class<?> clazz){
        return new SQL(){{

        }}.toString();
    }
}
