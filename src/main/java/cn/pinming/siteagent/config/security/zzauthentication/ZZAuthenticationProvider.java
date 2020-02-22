package cn.pinming.siteagent.config.security.zzauthentication;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :11:05
 * @Description:
 */
public class ZZAuthenticationProvider implements AuthenticationProvider {

    @Reference
    ZZUserDetailService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        ZZAuthenticationToken ZZToken = (ZZAuthenticationToken) authentication;
        UserDetails userDetails = userDetailsService.loadUserByUsername((String) ZZToken.getPrincipal());
        if (userDetails == null){
            throw new InternalAuthenticationServiceException("无法获取用户信息");
        }
        ZZAuthenticationToken zzAuthenticationToken = new ZZAuthenticationToken(userDetails, userDetails.getAuthorities());
        zzAuthenticationToken.setDetails(authentication.getDetails());
        return zzAuthenticationToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return ZZAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
