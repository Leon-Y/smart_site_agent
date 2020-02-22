package cn.pinming.siteagent.config.security.generalauthentication.handler;

import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import cn.pinming.siteagent.enums.LoginType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 36560
 * @Date: 2020/2/13 :13:55
 * @Description:
 */
@Component
public class BrowserAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Autowired
    private SmartSiteProperties smartSiteProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        if (LoginType.JSON.getType().equals(smartSiteProperties.getGeneral().getLoginType())){
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(exception.getMessage());
        }else{
                super.onAuthenticationFailure(request,response,exception);
        }
    }
}
