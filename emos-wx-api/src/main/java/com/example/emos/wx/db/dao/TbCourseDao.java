package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbCourse;

public interface TbCourseDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbCourse record);

    int insertSelective(TbCourse record);

    TbCourse selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbCourse record);

    int updateByPrimaryKey(TbCourse record);
}