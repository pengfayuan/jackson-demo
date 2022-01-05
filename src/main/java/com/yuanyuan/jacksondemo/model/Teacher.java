package com.yuanyuan.jacksondemo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Teacher {

    private String name;

    @JsonGetter("name")
    public String getHolderName() {
        return name;
    }

    @JsonSetter("name")
    public void setHolderName(String name) {
        this.name = name;
    }
}
