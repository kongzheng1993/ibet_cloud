package com.evil.ibetbusi.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBetsite {
    private Integer id;

    private String name;

    private String master;

    private String username;

    private String password;

    private String wxopneid;

    private Date registertime;

    private String bettypes;
}