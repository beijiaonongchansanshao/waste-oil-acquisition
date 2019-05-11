 package com.gy.oil.entity;

import java.io.Serializable;
/**
 * 
 * 用户测试实体类 
 * @ClassName:  User
 * @author: Mr.叶云
 * @date:   2019年5月11日 下午1:20:34
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String age;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }  
}
