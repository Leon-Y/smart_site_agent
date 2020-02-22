package cn.pinming.siteagent.common.response;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:02
 * @Description:
 */
public interface Response<T> {

    /**
     * 获取返回的请求错误信息（一般在失败的reponse中使用）
     * @return
     */
    String getMessage();

    /**
     * 获取请求的状态码
     * @return
     */
    String getCode();

    /**
     * 获取请求的数据
     * @return
     */
    T getData();

    /**
     * 获取请求的成功状态
     * @return
     */
    boolean getSuccess();
}
