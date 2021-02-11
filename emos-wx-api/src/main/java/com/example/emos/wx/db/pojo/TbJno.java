package com.example.emos.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_empower
 * @author 
 */
@Data
public class TbJno implements Serializable {
    private Integer userId;

    private String openId;

    private static final long serialVersionUID = 1L;
}