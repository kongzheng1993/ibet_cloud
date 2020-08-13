package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TBetBetsite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TBetBetsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBetBetsite record);

    int insertSelective(TBetBetsite record);

    TBetBetsite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBetBetsite record);

    int updateByPrimaryKey(TBetBetsite record);
}