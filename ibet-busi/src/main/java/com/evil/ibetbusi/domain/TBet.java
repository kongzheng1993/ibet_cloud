package com.evil.ibetbusi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBet {
    private Integer id;

    private String name;

    private Integer redballrange;

    private Integer blueballrange;

    private String picname;
}