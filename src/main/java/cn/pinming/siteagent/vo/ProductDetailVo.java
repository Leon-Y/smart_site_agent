package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :13:58
 * @Description: 产品详情
 */
@ApiModel("产品详情")
@Data
public class ProductDetailVo {

    /**
     * 产品名称
     */
    @ApiModelProperty(value = "产品名称",example = "产品名称")
    private String productName;

    /**
     * 应用名称
     */
    @ApiModelProperty(value = "应用名称",example = "应用名称")
    private List<ApplicationVo> applications;
}
