package com.feng.ai.base.controller;


import com.feng.ai.base.entity.User;
import com.feng.ai.base.service.UserService;
import com.feng.ai.base.util.ControllerResult;
import com.feng.ai.base.util.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="find",method= RequestMethod.GET)
    public ResponseEntity getUser(@RequestParam(value="name") String name){

        ServiceResult<List<User>> serviceResult = userService.findByName(name);
        ControllerResult<User> response = new ControllerResult();

        if (serviceResult.isHasError()) {
            response.setData(serviceResult.getData());
            return ResponseEntity.ok(response);
        } else {
            return new ResponseEntity(serviceResult, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(value="add")
    public ResponseEntity addUser(@RequestParam(value="name") String name,
                                   @RequestParam(value="age") Integer age ){

        ServiceResult<List<User>> serviceResult = userService.insert(name,age);
        ControllerResult<User> response = new ControllerResult();

        if (serviceResult.isHasError()) {
            response.setData(serviceResult.getData());
            return ResponseEntity.ok(response);
        } else {
            return new ResponseEntity(serviceResult, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
