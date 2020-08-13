package com.evil.ibetbusi.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TOrder {
    private Integer id;

    private Integer userid;

    private Integer betsiteid;

    private Integer betid;

    private String redballs;

    private String blueballs;

    private Integer times;

    private Date ordertime;
}