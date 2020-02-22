package cn.pinming.siteagent.service;

import cn.pinming.siteagent.model.Role;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :12:53
 * @Description:
 */
public interface RoleService {
    /**
     * 根据角色id获取角色
     *
     * @return
     */
    List<Role> getRoleByUserId(Integer userId);
}
