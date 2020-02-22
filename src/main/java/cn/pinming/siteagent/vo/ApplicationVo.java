package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :14:00
 * @Description:应用
 */
@ApiModel("应用")
@Data
public class ApplicationVo {

    /**
     * 应用id
     */
    @ApiModelProperty(value = "应用id",example = "应用id")
    private Integer applicationId;

    /**
     * 应用名称
     */
    @ApiModelProperty(value = "应用名称",example = "应用名称")
    private String applicationName;
}
