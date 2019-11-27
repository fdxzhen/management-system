package com.zhenhao.beans.account;

import java.io.Serializable;

public class RbacUserRole implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer roleId;

    @Override
    public String toString() {
        return "RbacUserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
