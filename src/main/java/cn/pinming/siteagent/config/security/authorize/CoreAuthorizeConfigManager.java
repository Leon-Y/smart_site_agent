package cn.pinming.siteagent.config.security.authorize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/21 :12:25
 * @Description:
 */
@Component
public class CoreAuthorizeConfigManager implements AuthorizeConfigManager {

    @Autowired
    private List<AuthorizeConfigProvider> authorizeConfigProviders;

    @Override
    public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        boolean existsAnyRequestMoreThanOne = false;
        String existsAnyRequestConfigName = "";

        for (AuthorizeConfigProvider authorizeConfigProvider:authorizeConfigProviders){
            boolean result = authorizeConfigProvider.config(config);
            if (existsAnyRequestMoreThanOne && result){
                throw  new RuntimeException("存在重复的anyRequest配置："+existsAnyRequestConfigName);
            }else if (result){
                existsAnyRequestMoreThanOne = true;
                existsAnyRequestConfigName = authorizeConfigProvider.getClass().getSimpleName();
            }
        }

        if (!existsAnyRequestMoreThanOne){
            config.anyRequest().authenticated();
        }
    }
}
