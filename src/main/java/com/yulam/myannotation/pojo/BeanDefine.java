package com.yulam.myannotation.pojo;

import lombok.Data;

/**
 * @author: 5yl
 * email: massyulin@gmail.com
 * time : 2018/1/25 上午9:34
 */

@Data
public class BeanDefine {

    private String id;

    private String className;

    public BeanDefine(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
