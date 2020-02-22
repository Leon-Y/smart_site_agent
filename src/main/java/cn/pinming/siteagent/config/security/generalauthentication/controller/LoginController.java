package cn.pinming.siteagent.config.security.generalauthentication.controller;

import cn.pinming.siteagent.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 36560
 * @Date: 2020/2/22 :13:13
 * @Description:
 */
@RestController
public class LoginController {

    /**
     * 默认未登录返回的内容
     * @return
     */
    @RequestMapping("/needLogin")
    public ResponseEntity<SuccessResponse> needLogin(){
        return ResponseEntity.ok(new SuccessResponse("当前用户需要进行登录"));
    }

    /**
     * 登录成功
     * @return
     */
    @RequestMapping("/success")
    public ResponseEntity<SuccessResponse> success(){
        return ResponseEntity.ok(new SuccessResponse("登录成功"));
    }
}
