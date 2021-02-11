package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbDept;

public interface TbDeptDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbDept record);

    int insertSelective(TbDept record);

    TbDept selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbDept record);

    int updateByPrimaryKey(TbDept record);
}