package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbUser;

public interface TbUserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}