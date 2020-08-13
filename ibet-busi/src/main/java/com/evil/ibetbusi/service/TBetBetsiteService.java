package com.evil.ibetbusi.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.evil.ibetbusi.domain.TBetBetsite;
import com.evil.ibetbusi.mapper.TBetBetsiteMapper;
@Service
public class TBetBetsiteService{

    @Resource
    private TBetBetsiteMapper tBetBetsiteMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tBetBetsiteMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TBetBetsite record) {
        return tBetBetsiteMapper.insert(record);
    }

    
    public int insertSelective(TBetBetsite record) {
        return tBetBetsiteMapper.insertSelective(record);
    }

    
    public TBetBetsite selectByPrimaryKey(Integer id) {
        return tBetBetsiteMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TBetBetsite record) {
        return tBetBetsiteMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TBetBetsite record) {
        return tBetBetsiteMapper.updateByPrimaryKey(record);
    }

}
