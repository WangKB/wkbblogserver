package com.wkb.wkbblogserver.controller;

import com.wkb.wkbblogserver.dao.TestEntityDao;
import com.wkb.wkbblogserver.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 79987 on 2017/1/5.
 */
@RestController
@RequestMapping(value="/home")
public class TestController {

    @Autowired
    TestEntityDao userMapper;
    @RequestMapping(value = "/user")
    public String user(){
        TestEntity user = userMapper.findUserByName("王伟");
        return user.getName()+"-----"+user.getAge();
    }

}
