package cn.pinming.siteagent.service;

import cn.pinming.siteagent.model.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :12:46
 * @Description:
 */
public interface UserService {
    /**
     * 根据用户名获取用户
     * @return
     */
    User getUserByUserName();

    /**
     * 根据用户的电话号码获取用户
     * @return
     */
    User getUserByUserTelNum();

    /**
     * 根据用户的手机号获取用户的详情{@link UserDetails}
     * @return
     */
    UserDetails getUserDetailsByUserTelNumber();
}
