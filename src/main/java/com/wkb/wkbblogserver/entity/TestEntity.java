package com.wkb.wkbblogserver.entity;

import javax.persistence.Table;

/**
 * Created by 79987 on 2017/1/5.
 */
@Table(name = "user")
public class TestEntity extends BaseEntity{

    private String name;
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
