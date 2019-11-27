package com.zhenhao.dao.account;

import com.zhenhao.beans.account.RbacRole;
import com.zhenhao.beans.account.RbacUser;
import org.apache.ibatis.annotations.Param;
import org.w3c.dom.ls.LSException;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Map;

public interface RbacUserDAO {
    List<RbacUser> getAllByPrevid(Map<String,Object> queryMap);
    List<RbacUser> getByPrevid(Map<String,Object> queryMap);
    List<RbacUser> getByAccountAndPassword(@Param("account") String account,@Param("password")String password);
    RbacUser getByUserId(int userId);
    void  deleteByUserId(@Param("id")int id);
    List<RbacUser> getUserByRoleId(int roleId);
    void updatePassword(@Param("userId")int userId,@Param("oldPassword")String oldPassword,@Param("newPassword")String newPassword);
    void updateUserPhone(@Param("userId")Integer userId,@Param("userphone")String userPhone);
    List<RbacUser> getUserInfoByPhone(@Param("userphone")String userPhone);
    void saveRbacUser(RbacUser rbacUser);
    void updateLastlogintime(String account);
    int checkCascade(Integer previd,Integer id);


}
