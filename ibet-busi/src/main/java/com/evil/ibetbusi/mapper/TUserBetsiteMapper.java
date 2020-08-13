package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TUserBetsite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserBetsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserBetsite record);

    int insertSelective(TUserBetsite record);

    TUserBetsite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserBetsite record);

    int updateByPrimaryKey(TUserBetsite record);
}