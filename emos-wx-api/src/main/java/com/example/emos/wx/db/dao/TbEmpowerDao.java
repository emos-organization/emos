package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbEmpower;

public interface TbEmpowerDao {
    public Integer searchIdByOpenId(String openId);
}