package com.yuanyuan.jacksondemo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author FAYUAN.PENG
 * @version \$Id: Teacher.java,  2021-08-22 11:00 FAYUAN.PENG Exp $$
 */
public class Teacher {

    private String name;

    @JsonGetter("name")
    public String getHolderName() {
        return this.name;
    }

    @JsonSetter("name")
    public void setHolderName(String name) {
        this.name = name;
    }
}
