package com.evil.ibetbusi.mapper;

import com.evil.ibetbusi.domain.TOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}