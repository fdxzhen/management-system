package com.zhenhao.dao.account;

import com.zhenhao.beans.account.RbacMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RbacMenuDAO {
    List<RbacMenu> getAllMenuByUserIdAndMenuType(@Param("userId") int userId,@Param("menuType") int menuType);
    List<RbacMenu> getAllMenuByRoleId(@Param("roleID") int roleId,@Param("menuType") int menuType);
    List<RbacMenu> getAllRbacMenu();
    void updateRbacMenu(RbacMenu rbacMenu);
    void deleteRbacMenu();
    void saveRbacMenu(RbacMenu rbacMenu);

}
