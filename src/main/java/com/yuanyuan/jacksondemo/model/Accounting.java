package com.yuanyuan.jacksondemo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author FAYUAN.PENG
 * @version \$Id: Accounting.java,  2021-08-22 13:25 FAYUAN.PENG Exp $$
 */
@JsonPropertyOrder({"name", "age", "id"})
public class Accounting {

    private Integer age;
    private String name;
    private Integer id;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
