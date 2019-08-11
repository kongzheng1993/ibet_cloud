package com.evil.ibetbusi.repository;

import com.evil.ibetbusi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Project: ibet_cloud
 * @Author: kongz
 * @Date: 2019/8/11 20:22
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    /**
     * 通过微信openid查找用户
     * @param wxOpenId
     * @return
     */
    @Query(value = "select id, wxOpenId, userName, wxNickName, idCardNo, phoneNo, registerTime from User where wxOpenId = ?1")
    User findByWxopenid(String wxOpenId);

}
