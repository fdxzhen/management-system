package com.zhenhao.beans.account;

import java.io.Serializable;
import java.util.Arrays;

public class RbacRole implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String remarks;
    private String[] checkMenuList;

    @Override
    public String toString() {
        return "RbacRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", checkMenuList=" + Arrays.toString(checkMenuList) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String[] getCheckMenuList() {
        return checkMenuList;
    }

    public void setCheckMenuList(String[] checkMenuList) {
        this.checkMenuList = checkMenuList;
    }
}
