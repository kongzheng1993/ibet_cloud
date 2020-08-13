package com.evil.ibetbusi.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser {
    private Integer id;

    private String wxopenid;

    private String username;

    private String wxnickname;

    private String idcardno;

    private String phoneno;

    private Date registertime;
}