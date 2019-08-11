package com.evil.ibetbusi.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

/**
 * @Description:
 * @Project: ibet_cloud
 * @Author: kongz
 * @Date: 2019/8/11 20:05
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "t_user")
@Data public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     *     微信openId
     */
    @Column(name = "wxopenid")
    @NonNull
    private String wxOpenId;


    /**
     * 用户微信昵称
     */
    @Column(name = "wxnickname")
    @NonNull
    private String wxNickName;

    /**
     * 用户真实姓名
     */
    @Column(name = "username")
    private String userName;

    /**
     * 用户身份证信息
     */
    @Column(name = "idcardno")
    private String idCardNo;

    /**
     * 用户手机号码
     */
    @Column(name = "phoneno")
    private String phoneNo;

    /**
     * 用户注册时间
     */
    @Column(name = "registertime")
    private Date registerTime;

}
