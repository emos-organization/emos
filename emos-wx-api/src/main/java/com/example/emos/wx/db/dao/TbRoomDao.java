package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRoom;

public interface TbRoomDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(TbRoom record);

    int insertSelective(TbRoom record);

    TbRoom selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(TbRoom record);

    int updateByPrimaryKey(TbRoom record);
}