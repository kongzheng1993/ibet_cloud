package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TBet;

public interface TBetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBet record);

    int insertSelective(TBet record);

    TBet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBet record);

    int updateByPrimaryKey(TBet record);
}