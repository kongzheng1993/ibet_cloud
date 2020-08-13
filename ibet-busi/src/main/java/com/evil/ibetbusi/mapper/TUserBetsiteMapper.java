package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TUserBetsite;

public interface TUserBetsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserBetsite record);

    int insertSelective(TUserBetsite record);

    TUserBetsite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserBetsite record);

    int updateByPrimaryKey(TUserBetsite record);
}