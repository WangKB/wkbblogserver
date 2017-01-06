package com.wkb.wkbblogserver.controller;

import com.wkb.wkbblogserver.dao.BaseEntityDao;
import com.wkb.wkbblogserver.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 79987 on 2017/1/5.
 */
@RestController
@RequestMapping(value="/home")
public class TestController {

    @Autowired
    BaseEntityDao userMapper;
    @RequestMapping(value = "/user")
    public String user(){
        TestEntity user = userMapper.findUserByName("王二");
        return user.getName()+"-----"+user.getAge();
    }

}
