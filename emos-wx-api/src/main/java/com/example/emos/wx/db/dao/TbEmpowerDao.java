package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbEmpower;

import java.util.HashMap;

public interface TbEmpowerDao {
    public Integer searchIdByOpenId(String openId);
    public int insert(HashMap param);
}