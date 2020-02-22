package cn.pinming.siteagent.common.response;

import io.swagger.annotations.ApiModel;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:07
 * @Description:成功响应
 */
@ApiModel("成功的请求")
public class SuccessResponse<T> extends AbstractResponse<T>{

    public SuccessResponse(T data) {
        super("", "200", data, true);
    }
}