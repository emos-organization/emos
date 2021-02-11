package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRole;

public interface TbRoleDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}