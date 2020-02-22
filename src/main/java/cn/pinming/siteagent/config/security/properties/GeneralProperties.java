package cn.pinming.siteagent.config.security.properties;

import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :11:37
 * @Description:
 */
@Data
public class GeneralProperties {
    /**
     * 表单登录请求链接
     */
    private String loginProcessingUrl = "/login";

    /**
     * 默认请求的登录页
     */
    private String loginPage = "/needLogin";

    /**
     * 登录类型
     */
    private String loginType = "JSON";

    /**
     * 不需要进行验证登录资源路径
     */
    private String unAccessUrls="/success,/needAcess";

}
