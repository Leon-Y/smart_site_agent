package cn.pinming.siteagent.common.response;

import io.swagger.annotations.ApiModel;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:17
 * @Description: 失败的响应
 */
@ApiModel("失败的请求")
public class FailureResponse<T> extends AbstractResponse<T> {

    public FailureResponse(String message, String code) {
        super(message, code, null, false);
    }

    public FailureResponse(String message, String code, T data) {
        super(message, code, data, false);
    }
}
