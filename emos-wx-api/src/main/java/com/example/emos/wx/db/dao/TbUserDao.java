package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbUser;

import java.util.HashMap;
import java.util.Set;

public interface TbUserDao {
    public int insert(HashMap param);
    public boolean haveRootUser();
    public String searchUserHiredate(int userId);
    public HashMap searchUserSummary(int userId);
    public TbUser searchById(int userId);
    public Set<String> searchUserPermissions(int userId);
}