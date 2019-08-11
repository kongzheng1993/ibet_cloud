package com.evil.ibetbusi.service.impl;

import com.evil.ibetbusi.model.User;
import com.evil.ibetbusi.repository.UserRepository;
import com.evil.ibetbusi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description:
 * @Project: ibet_cloud
 * @Author: kongz
 * @Date: 2019/8/11 20:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByWxOpenId(String wxOpenId) {
        return userRepository.findByWxopenid(wxOpenId);
    }

    @Override
    public User getUserById(String wxOpenId) {
        return null;
    }

    @Override
    public int updateUserById(User user) {
        return 0;
    }

    @Override
    public int updateUserBalanceByUserIdBetSiteId(Map map) {
        return 0;
    }
}
