package com.zh.demo.impl;

import com.zh.demo.dao.TMessageMapper;
import com.zh.demo.entity.TMessage;
import com.zh.demo.service.TMessageService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-02-12 16:35:07
 **/ 
@Service("tMessageService")
public class TMessageServiceImpl implements TMessageService {
    @Resource
    private TMessageMapper tMessageMapper;

    private static final Logger logger = LoggerFactory.getLogger(TMessageServiceImpl.class);

    @Override
    public int insert(TMessage record) {
        return this.tMessageMapper.insert(record);
    }

    @Override
    public int insertSelective(TMessage record) {
        return this.tMessageMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(TMessage record) {
        return this.tMessageMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TMessage record) {
        return this.tMessageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.tMessageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TMessage selectByPrimaryKey(Integer id) {
        return this.tMessageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TMessage> selectAll(Map<Object, Object> param) {
        return this.tMessageMapper.selectAll(param);
    }

    @Override
    public List<TMessage> selectPaging(Map<Object, Object> param) {
        return this.tMessageMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.tMessageMapper.selectCount(param);
    }
}