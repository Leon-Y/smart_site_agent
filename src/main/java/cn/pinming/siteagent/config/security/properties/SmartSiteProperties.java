package cn.pinming.siteagent.config.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :10:49
 * @Description:
 */
@ConfigurationProperties(prefix = "smart.site")
@Data
public class SmartSiteProperties {

    @NestedConfigurationProperty
    private GeneralProperties general = new GeneralProperties();

    @NestedConfigurationProperty
    private ZZProperties zz = new ZZProperties();
}
