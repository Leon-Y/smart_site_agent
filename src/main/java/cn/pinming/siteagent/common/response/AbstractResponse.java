package cn.pinming.siteagent.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:08
 * @Description:
 */
@ApiModel("请求响应内容")
public abstract class AbstractResponse<T> implements Response<T> {

    /**
     * 请求结果信息
     */
    @ApiModelProperty("请求的结果信息")
    private String message;

    /**
     * 请求状态码
     */
    @ApiModelProperty("请求的状态码")
    private String code;

    /**
     * 请求返回内容
     */
    @ApiModelProperty("请求返回的内容")
    private T data;

    /**
     * 请求是否成功
     */
    @ApiModelProperty("请求是否成功")
    private boolean success = true;

    protected AbstractResponse(String message, String code, T data, boolean success) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.success = success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }
}
