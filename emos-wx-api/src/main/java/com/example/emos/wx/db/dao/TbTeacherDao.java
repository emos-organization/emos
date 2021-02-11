package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbTeacher;

public interface TbTeacherDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbTeacher record);

    int insertSelective(TbTeacher record);

    TbTeacher selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbTeacher record);

    int updateByPrimaryKey(TbTeacher record);
}