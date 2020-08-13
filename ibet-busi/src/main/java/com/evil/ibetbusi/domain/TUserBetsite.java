package com.evil.ibetbusi.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUserBetsite {
    private Integer id;

    private Integer userid;

    private Integer betsiteid;

    private BigDecimal balance;
}