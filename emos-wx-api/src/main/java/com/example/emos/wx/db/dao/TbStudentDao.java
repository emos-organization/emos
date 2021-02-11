package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbStudent;

public interface TbStudentDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    TbStudent selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);
}