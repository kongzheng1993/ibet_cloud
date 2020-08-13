package com.evil.ibetbusi.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.evil.ibetbusi.domain.TOrder;
import com.evil.ibetbusi.mapper.TOrderMapper;
@Service
public class TOrderService{

    @Resource
    private TOrderMapper tOrderMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tOrderMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TOrder record) {
        return tOrderMapper.insert(record);
    }

    
    public int insertSelective(TOrder record) {
        return tOrderMapper.insertSelective(record);
    }

    
    public TOrder selectByPrimaryKey(Integer id) {
        return tOrderMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TOrder record) {
        return tOrderMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TOrder record) {
        return tOrderMapper.updateByPrimaryKey(record);
    }

}
