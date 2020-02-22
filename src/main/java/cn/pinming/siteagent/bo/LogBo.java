package cn.pinming.siteagent.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :14:11
 * @Description:日志业务
 */
@ApiModel("日志业务")
@Data
public class LogBo {

    /**
     * 代理商id
     */
    @ApiModelProperty(value = "代理商id",example = "123456",required = true)
    private Integer agentId;

    /**
     * 操作类型：0 代理商管理 1 产品管理 2 代理商企业管理 3 代理商项目管理 4 产品授权
     */
    @ApiModelProperty(value = "操作类型：0 代理商管理 1 产品管理 2 代理商企业管理 3 代理商项目管理 4 产品授权",example = "0",required = true)
    private Integer operationType;

    /**
     * 操作详细类型：0 新增 1 更新 2 删除
     */
    @ApiModelProperty(value = "操作详细类型：0 新增 1 更新 2 删除",example = "0")
    private Integer operationTypeDetail;

}
