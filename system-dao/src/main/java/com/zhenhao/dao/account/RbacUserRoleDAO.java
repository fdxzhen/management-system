package com.zhenhao.dao.account;

import com.zhenhao.beans.account.RbacUserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RbacUserRoleDAO {

    Map<String,String> getUserByRoleId(Map<String,Object> params);
    void deleteRoleMenuByUserId(@Param("userId") int userId);
    void saveRbacUserRole(RbacUserRole rbacUserRole);
    List<RbacUserRole> getRbacUserRoleByUserId(@Param("userId")Integer userId);
}
