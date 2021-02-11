package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbTeacher;

public interface TbTeacherDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbTeacher record);

    int insertSelective(TbTeacher record);

    TbTeacher selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbTeacher record);

    int updateByPrimaryKey(TbTeacher record);
}