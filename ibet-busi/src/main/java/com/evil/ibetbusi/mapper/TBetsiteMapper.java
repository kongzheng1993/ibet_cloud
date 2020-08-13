package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TBetsite;

public interface TBetsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBetsite record);

    int insertSelective(TBetsite record);

    TBetsite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBetsite record);

    int updateByPrimaryKey(TBetsite record);
}