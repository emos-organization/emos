package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbJno;

public interface TbJnoDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbJno record);

    int insertSelective(TbJno record);

    TbJno selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbJno record);

    int updateByPrimaryKey(TbJno record);
}