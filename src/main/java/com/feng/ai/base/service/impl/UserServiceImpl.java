package com.feng.ai.base.service.impl;

import com.feng.ai.base.entity.User;
import com.feng.ai.base.mapper.UserMapper;
import com.feng.ai.base.service.UserService;
import com.feng.ai.base.util.ServiceResult;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ServiceResult<List<User>> insert(String name, Integer age){
        ServiceResult<List<User>> serviceResult = new ServiceResult<>();
        try{
            userMapper.insert(name, age);
            serviceResult.setData(null);
            serviceResult.setHasError(false);
            return serviceResult;
        } catch (Exception ex){
            return handleError(serviceResult,ex);
        }
    }

    @Override
    public ServiceResult<List<User>> findByName(String name) {

        ServiceResult<List<User>> serviceResult = new ServiceResult<>();
        try {

            List<User> users = userMapper.findByName(name);
            serviceResult.setData(users);
            serviceResult.setHasError(false);
            return serviceResult;

        } catch (Exception ex) {
            return handleError(serviceResult,ex);
        }
    }

    private ServiceResult<List<User>> handleError(ServiceResult<List<User>> result, Exception ex) {
        result.setData(null);
        result.setHasError(true);
        result.addErrorMessage(ExceptionUtils.getMessage(ex));
        return result;
    }
}
