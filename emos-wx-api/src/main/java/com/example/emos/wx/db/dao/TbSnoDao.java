package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbSno;

public interface TbSnoDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbSno record);

    int insertSelective(TbSno record);

    TbSno selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbSno record);

    int updateByPrimaryKey(TbSno record);
}