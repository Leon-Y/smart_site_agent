package cn.pinming.siteagent.config.security.generalauthentication.handler;

import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.config.security.properties.SmartSiteProperties;
import cn.pinming.siteagent.enums.LoginType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 36560
 * @Date: 2020/2/13 :13:42
 * @Description:
 */
@Component
public class BrowserAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private SmartSiteProperties smartSiteProperties;

    private RequestCache requestCache = new HttpSessionRequestCache();

    @Override
    public void setRequestCache(RequestCache requestCache) {
        this.requestCache = requestCache;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        if (LoginType.JSON.getType().equals(smartSiteProperties.getGeneral().getLoginType())){
            response.getWriter().write(objectMapper.writeValueAsString(new SuccessResponse<>("success")));
            response.setContentType("application/json;charset=UTF-8");
        }else {
            SavedRequest savedRequest = requestCache.getRequest(request, response);
            if (savedRequest != null ){
                String redirectUrl = savedRequest.getRedirectUrl();
                if (StringUtils.isEmpty(redirectUrl)){
                    getRedirectStrategy().sendRedirect(request, response, "/success");
                }
            }else if (savedRequest == null){
                getRedirectStrategy().sendRedirect(request, response, "/success");
            }
            super.onAuthenticationSuccess(request,response,authentication);
        }

    }
}
