package com.yuanyuan.jacksondemo.model;

import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * @author FAYUAN.PENG
 * @version \$Id: Programmer.java,  2021-08-22 14:30 FAYUAN.PENG Exp $$
 */
public class Programmer {

    private String name;
    private String address;
    @JsonRawValue
    private String address2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}
