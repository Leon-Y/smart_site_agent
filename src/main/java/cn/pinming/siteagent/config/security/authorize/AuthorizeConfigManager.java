package cn.pinming.siteagent.config.security.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @Auther: 36560
 * @Date: 2020/2/21 :12:08
 * @Description:
 */
public interface AuthorizeConfigManager {

    /**
     * 管理配置
     * @param config
     */
    void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);
}
