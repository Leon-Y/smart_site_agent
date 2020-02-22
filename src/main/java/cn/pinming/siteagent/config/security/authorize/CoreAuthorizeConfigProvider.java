package cn.pinming.siteagent.config.security.authorize;

import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/21 :12:20
 * @Description:
 */
@Component
public class CoreAuthorizeConfigProvider implements AuthorizeConfigProvider {

    @Autowired
    private SmartSiteProperties securityCoreProperties;

    @Override
    public boolean config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        String[] smsUrls = securityCoreProperties.getGeneral().getLoginPage().split(",");
        String[] imageUrls = securityCoreProperties.getGeneral().getLoginProcessingUrl().split(",");
//        String[] validateUrls = securityCoreProperties.getCode().getSmsCodeProperties().getValidateUrls().split(",");
        String[] any = securityCoreProperties.getGeneral().getUnAccessUrls().split(",");
        List<String> permits = new ArrayList<String>();
        permits.addAll(Arrays.asList(smsUrls));
        permits.addAll(Arrays.asList(imageUrls));
        permits.addAll(Arrays.asList(any));
        String[] permitUrls = new String[permits.size()];
        permits.toArray(permitUrls);

        config.antMatchers(permitUrls).permitAll();
        return false;
    }
}
