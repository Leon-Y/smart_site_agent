package cn.pinming.siteagent.config.security.generalauthentication.service;

import cn.pinming.siteagent.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :12:31
 * @Description:
 */
@Component("generalUserDetailService")
public class GeneralUserDetailService implements UserDetailsService {

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails userDetailsByUserTelNumber = userService.getUserDetailsByUserTelNumber();
        return userDetailsByUserTelNumber;
    }
}
