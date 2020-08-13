package com.evil.ibetbusi.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.evil.ibetbusi.mapper.TBetMapper;
import com.evil.ibetbusi.domain.TBet;
@Service
public class TBetService{

    @Resource
    private TBetMapper tBetMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tBetMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TBet record) {
        return tBetMapper.insert(record);
    }

    
    public int insertSelective(TBet record) {
        return tBetMapper.insertSelective(record);
    }

    
    public TBet selectByPrimaryKey(Integer id) {
        return tBetMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TBet record) {
        return tBetMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TBet record) {
        return tBetMapper.updateByPrimaryKey(record);
    }

}
