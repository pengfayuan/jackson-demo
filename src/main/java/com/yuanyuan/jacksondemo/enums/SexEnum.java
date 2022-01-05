package com.yuanyuan.jacksondemo.enums;

/**
 * @author FAYUAN.PENG
 * @version \$Id: SexEnum.java,  2021-08-22 16:11 FAYUAN.PENG Exp $$
 */
public enum SexEnum {
    MAN("男"), WOMAN("女");

    private String sex;

    SexEnum(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }}
