package com.evil.ibetbusi.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.evil.ibetbusi.mapper.TUserBetsiteMapper;
import com.evil.ibetbusi.domain.TUserBetsite;
@Service
public class TUserBetsiteService{

    @Resource
    private TUserBetsiteMapper tUserBetsiteMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tUserBetsiteMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TUserBetsite record) {
        return tUserBetsiteMapper.insert(record);
    }

    
    public int insertSelective(TUserBetsite record) {
        return tUserBetsiteMapper.insertSelective(record);
    }

    
    public TUserBetsite selectByPrimaryKey(Integer id) {
        return tUserBetsiteMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TUserBetsite record) {
        return tUserBetsiteMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TUserBetsite record) {
        return tUserBetsiteMapper.updateByPrimaryKey(record);
    }

}
