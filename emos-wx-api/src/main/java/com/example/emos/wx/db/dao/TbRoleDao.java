package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRole;

public interface TbRoleDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}