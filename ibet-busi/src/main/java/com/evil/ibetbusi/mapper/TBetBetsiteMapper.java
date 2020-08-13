package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TBetBetsite;

public interface TBetBetsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBetBetsite record);

    int insertSelective(TBetBetsite record);

    TBetBetsite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBetBetsite record);

    int updateByPrimaryKey(TBetBetsite record);
}