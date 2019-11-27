package com.zhenhao.beans.account;

import java.io.Serializable;
import java.util.List;

public class RbacMenu  implements Serializable {

    private static final long serialVersionUID = 3L;

    private Integer id;

    private String pid;

    private String name;

    private Integer pageUrl;

    private Integer state;

    private Integer sort;

    private String icon;

    private String remarks;

    private List<RbacMenu> leafMenu;

    @Override
    public String toString() {
        return "RbacMenu{" +
                "id=" + id +
                ", pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", pageUrl=" + pageUrl +
                ", state=" + state +
                ", sort=" + sort +
                ", icon='" + icon + '\'' +
                ", remarks='" + remarks + '\'' +
                ", leafMenu=" + leafMenu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(Integer pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<RbacMenu> getLeafMenu() {
        return leafMenu;
    }

    public void setLeafMenu(List<RbacMenu> leafMenu) {
        this.leafMenu = leafMenu;
    }
}
