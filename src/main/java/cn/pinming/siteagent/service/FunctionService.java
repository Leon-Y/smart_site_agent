package cn.pinming.siteagent.service;

import cn.pinming.siteagent.model.Function;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :12:54
 * @Description:
 */
public interface FunctionService {

    /**
     * 根据角色id获取用户的funtion
     * @return
     */
    List<Function> getFunctionByRoleID(Integer RoleId);

}
