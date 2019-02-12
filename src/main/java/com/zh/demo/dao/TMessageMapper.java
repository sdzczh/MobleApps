package com.zh.demo.dao;

import com.zh.demo.entity.TMessage;
import java.util.List;
import java.util.Map;

public interface TMessageMapper {
    int insert(TMessage record);

    int insertSelective(TMessage record);

    int updateByPrimaryKey(TMessage record);

    int updateByPrimaryKeySelective(TMessage record);

    int deleteByPrimaryKey(Integer id);

    TMessage selectByPrimaryKey(Integer id);

    List<TMessage> selectAll(Map<Object, Object> param);

    List<TMessage> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}