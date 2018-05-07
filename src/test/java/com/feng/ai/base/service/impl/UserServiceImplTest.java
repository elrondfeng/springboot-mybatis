package com.feng.ai.base.service.impl;

import com.feng.ai.base.entity.User;
import com.feng.ai.base.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        userService.insert("Tao",18);
        userService.insert("Feng",20);
    }

    @Test
    public void testFindByName() throws Exception {

    }
}