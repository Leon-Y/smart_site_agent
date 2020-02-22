package cn.pinming.siteagent.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :13:48
 * @Description:
 */
@ApiModel("授权")
@Data
public class AuthorizingBo {

    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id",example = "123456",required = true)
    private Integer projectId;

    /**
     * 产品列表
     */
    @ApiModelProperty(value = "产品列表",example = "1,2",required = true)
    private Integer[] products;
}
