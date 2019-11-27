package com.zhenhao.dao.account;

import com.zhenhao.beans.account.RbacRoleMenu;

import java.util.List;

public interface RbacRoleMenuDAO {

    void saveRbacRoleMenu(List<RbacRoleMenu> rbacRoleMenus);
    void deleteByRoleId(int roleId);

}
