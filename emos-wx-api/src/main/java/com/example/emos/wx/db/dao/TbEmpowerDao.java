package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbEmpower;

public interface TbEmpowerDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbEmpower record);

    int insertSelective(TbEmpower record);

    TbEmpower selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbEmpower record);

    int updateByPrimaryKey(TbEmpower record);
}