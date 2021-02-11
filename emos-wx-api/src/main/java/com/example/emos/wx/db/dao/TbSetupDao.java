package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbSetup;

public interface TbSetupDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbSetup record);

    int insertSelective(TbSetup record);

    TbSetup selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbSetup record);

    int updateByPrimaryKey(TbSetup record);
}