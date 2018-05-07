package com.feng.ai.base.service;

import com.feng.ai.base.entity.User;
import com.feng.ai.base.util.ServiceResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    ServiceResult<List<User>> insert(String name, Integer age);
    ServiceResult<List<User>> findByName(String name);

}
