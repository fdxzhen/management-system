package com.zhenhao.dao.account;

import com.zhenhao.beans.account.RbacRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RbacRoleDAO {

    RbacRole getRoleByUserId(@Param("userId") Integer userId);
    RbacRole getRoleByRoleId(@Param("roleId") Integer roleId);
    List<RbacRole> getAllRole(RbacRole rbacRole);
    int saveRbacRole(RbacRole rbacRole);
    void deleteByPromaryKey(int roleId);
    void updateRbacRole(RbacRole rbacRole);
    List<RbacRole> getAllRbacRole();
    List<RbacRole> getRoleByIdList(List<Integer> lstRoleId);



}
