package cn.pinming.siteagent.config;

import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :10:52
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(SmartSiteProperties.class)
public class CommonConfig {

}
