package com.evil.ibetbusi.service;

import com.evil.ibetbusi.model.User;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Project: ibet_cloud
 * @Author: kongz
 * @Date: 2019/8/11 20:30
 */
public interface UserService {

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 通过微信openid获取用户
     * @param wxOpenId
     * @return
     */
    User getUserByWxOpenId(String wxOpenId);

    /**
     * 通过id获取用户
     * @param wxOpenId
     * @return
     */
    User getUserById(String wxOpenId);

    /**
     * 通过id更新用户
     * @param user
     * @return
     */
    int updateUserById(User user);

    /**
     * 通过用户id获得用户投注站
     * @param map
     * @return
     */
    //List<BetSite> getUserBetSitesByUserId(String userId);

    /**
     * 通过用户id更新用户投注站余额
     * @param map
     * @return
     */
    int updateUserBalanceByUserIdBetSiteId(Map map);

}
