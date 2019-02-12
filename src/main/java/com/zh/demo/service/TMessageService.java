package com.zh.demo.service;

import com.zh.demo.entity.TMessage;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-02-12 16:35:07
 **/ 
public interface TMessageService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int insert(TMessage record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int insertSelective(TMessage record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int updateByPrimaryKey(TMessage record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int updateByPrimaryKeySelective(TMessage record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    TMessage selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    List<TMessage> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    List<TMessage> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-02-12 16:35:07
     **/ 
    int selectCount(Map<Object, Object> param);
}