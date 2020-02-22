package cn.pinming.siteagent.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :13:45
 * @Description:
 */
@ApiModel("产品类型")
@Data
public class ProductVo {

    /**
     * 产品id
     */
    @ApiModelProperty(value = "产品id",example = "产品id")
    private Integer productId;

    /**
     * 授权产品名称
     */
    @ApiModelProperty(value = "授权产品名称",example = "授权产品名称")
    private String productName;

    /**
     * 授权数量
     */
    @ApiModelProperty(value = "授权数量",example = "授权数量")
    private Integer authorizingQuantity;

    /**
     * 已使用授权数量
     */
    @ApiModelProperty(value = "已使用授权数量",example = "已使用授权数量")
    private Integer authorizingUsageQuantity;

    /**
     * 未使用授权数量
     */
    @ApiModelProperty(value = "未使用授权数量",example = "未使用授权数量")
    private Integer authorizingUnusedQuantity;

    /**
     * 产品类型：0 企业级 1 项目级
     */
    @ApiModelProperty(value = "产品类型：0 企业级 1 项目级",example = "产品类型：0 企业级 1 项目级")
    private Integer productType;
}
