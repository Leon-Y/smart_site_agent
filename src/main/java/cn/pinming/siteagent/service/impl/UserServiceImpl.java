package cn.pinming.siteagent.service.impl;

import cn.pinming.siteagent.config.security.generalauthentication.entity.OriginalUser;
import cn.pinming.siteagent.mapper.UserMapper;
import cn.pinming.siteagent.model.User;
import cn.pinming.siteagent.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :12:50
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public User getUserByUserName() {

        return null;
    }

    @Override
    public User getUserByUserTelNum() {
        return null;
    }

    @Override
    public UserDetails getUserDetailsByUserTelNumber() {
        User user = new User();
        user.setUserName("user");
        user.setTelNum("1568999999");
        user.setPassword(passwordEncoder.encode("123456"));
        OriginalUser originalUser = new OriginalUser(user);
        return originalUser;
    }
}
