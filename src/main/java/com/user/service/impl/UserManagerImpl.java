package com.user.service.impl;

import com.user.dao.UserMapper;
import com.user.model.SignUp;
import com.user.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userManager")
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;
    @Override
    public SignUp signUp(SignUp signUp) {

        return null;
    }
}
