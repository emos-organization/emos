package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRoom;

public interface TbRoomDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbRoom record);

    int insertSelective(TbRoom record);

    TbRoom selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbRoom record);

    int updateByPrimaryKey(TbRoom record);
}