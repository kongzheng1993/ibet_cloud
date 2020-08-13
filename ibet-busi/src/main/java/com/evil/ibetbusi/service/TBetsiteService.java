package com.evil.ibetbusi.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.evil.ibetbusi.mapper.TBetsiteMapper;
import com.evil.ibetbusi.domain.TBetsite;
@Service
public class TBetsiteService{

    @Resource
    private TBetsiteMapper tBetsiteMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tBetsiteMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TBetsite record) {
        return tBetsiteMapper.insert(record);
    }

    
    public int insertSelective(TBetsite record) {
        return tBetsiteMapper.insertSelective(record);
    }

    
    public TBetsite selectByPrimaryKey(Integer id) {
        return tBetsiteMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TBetsite record) {
        return tBetsiteMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TBetsite record) {
        return tBetsiteMapper.updateByPrimaryKey(record);
    }

}
