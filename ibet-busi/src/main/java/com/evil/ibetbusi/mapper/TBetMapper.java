package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TBet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TBetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBet record);

    int insertSelective(TBet record);

    TBet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBet record);

    int updateByPrimaryKey(TBet record);
}