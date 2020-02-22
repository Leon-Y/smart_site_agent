package cn.pinming.siteagent.config.security;

import cn.pinming.siteagent.config.security.authorize.CoreAuthorizeConfigManager;
import cn.pinming.siteagent.config.security.generalauthentication.handler.BrowserAuthenticationFailureHandler;
import cn.pinming.siteagent.config.security.generalauthentication.handler.BrowserAuthenticationSuccessHandler;
import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :10:47
 * @Description:
 */
@Configuration
public class SmartSiteSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SmartSiteProperties smartSiteProperties;

    @Autowired
    BrowserAuthenticationSuccessHandler successHandler;

    @Autowired
    BrowserAuthenticationFailureHandler failureHandler;

    @Resource
    private UserDetailsService userDetailsService;

    @Autowired
    private CoreAuthorizeConfigManager coreAuthorizeConfigManager;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage(smartSiteProperties.getGeneral().getLoginPage())
                .loginProcessingUrl(smartSiteProperties.getGeneral().getLoginProcessingUrl())
                .successHandler(successHandler)
                .failureHandler(failureHandler)
                .and()
                .csrf()
                .disable()
                .cors()
                .and()
                .userDetailsService(userDetailsService)
        ;
        coreAuthorizeConfigManager.config(http.authorizeRequests());
    }

    @Bean
    @ConditionalOnMissingBean(PasswordEncoder.class)
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
