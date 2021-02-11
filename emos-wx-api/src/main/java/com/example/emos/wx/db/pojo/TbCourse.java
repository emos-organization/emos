package com.example.emos.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_course
 * @author 
 */
@Data
public class TbCourse implements Serializable {
    private Integer courseId;

    private String courseName;

    private Integer fixedJno;

    private static final long serialVersionUID = 1L;
}