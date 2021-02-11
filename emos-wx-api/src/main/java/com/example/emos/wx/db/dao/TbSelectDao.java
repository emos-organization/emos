package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbSelect;

public interface TbSelectDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbSelect record);

    int insertSelective(TbSelect record);

    TbSelect selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbSelect record);

    int updateByPrimaryKey(TbSelect record);
}