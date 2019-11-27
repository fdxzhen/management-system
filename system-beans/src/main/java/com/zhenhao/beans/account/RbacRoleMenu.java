package com.zhenhao.beans.account;

import java.io.Serializable;

public class RbacRoleMenu implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer menuId;

    @Override
    public String toString() {
        return "RbacRoleMenu{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
