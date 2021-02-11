package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbSelect;

public interface TbSelectDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbSelect record);

    int insertSelective(TbSelect record);

    TbSelect selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbSelect record);

    int updateByPrimaryKey(TbSelect record);
}