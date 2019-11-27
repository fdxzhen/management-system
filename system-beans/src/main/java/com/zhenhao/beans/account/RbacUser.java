package com.zhenhao.beans.account;

import java.io.Serializable;
import java.util.Date;

public class RbacUser implements Serializable {

    private Integer id;
    /*
    父级账号编号
     */
    private Integer previd;
    /**
     * 登录账户
     */
    private String account;
    private String password;
    private String name;
    private String email;
    private String depaid;
    private Date updatetime;
    private Date lastlogintime;
    /**
     * 角色
     */
    private RbacRole rbacRole;
    /**
     * 角色ID
     */
    private Integer rbacRoleId;

    @Override
    public String toString() {
        return "RbacUser{" +
                "id=" + id +
                ", previd=" + previd +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", depaid='" + depaid + '\'' +
                ", updatetime=" + updatetime +
                ", lastlogintime=" + lastlogintime +
                ", rbacRole=" + rbacRole +
                ", rbacRoleId=" + rbacRoleId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrevid() {
        return previd;
    }

    public void setPrevid(Integer previd) {
        this.previd = previd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepaid() {
        return depaid;
    }

    public void setDepaid(String depaid) {
        this.depaid = depaid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public RbacRole getRbacRole() {
        return rbacRole;
    }

    public void setRbacRole(RbacRole rbacRole) {
        this.rbacRole = rbacRole;
    }

    public Integer getRbacRoleId() {
        return rbacRoleId;
    }

    public void setRbacRoleId(Integer rbacRoleId) {
        this.rbacRoleId = rbacRoleId;
    }
}
