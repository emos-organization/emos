package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbJno;

public interface TbJnoDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbJno record);

    int insertSelective(TbJno record);

    TbJno selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbJno record);

    int updateByPrimaryKey(TbJno record);
}