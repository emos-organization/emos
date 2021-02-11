package com.example.emos.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_teacher
 * @author 
 */
@Data
public class TbRoom implements Serializable {
    private Integer jno;

    private String title;

    private static final long serialVersionUID = 1L;
}