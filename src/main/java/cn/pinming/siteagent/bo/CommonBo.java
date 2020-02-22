package cn.pinming.siteagent.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Setter;

/**
 * @Author: Administrator
 * @Date: 2019/12/10 :11:12
 * @Description:
 */
@Data
@ApiModel("通用参数")
public class CommonBo {
    /**
     * 企业id
     */
    @JsonProperty
    @ApiModelProperty(value = "企业id",example = "123456",required = true)
    private Integer coid;

    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id",example = "123456",required = true)
    private Integer pjId;

    /**
     * 代理商类型：0 全国代理商1 区域代理商
     */
    @ApiModelProperty(value = "代理商类型：0 全国代理商1 区域代理商",example = "1",required = true)
    private String type;

    /**
     * 页码
     */
    @ApiModelProperty(value = "页码：空值或不传，默认返回所有值",example = "0")
    private String page;

    /**
     * 每页行数
     */
    @ApiModelProperty(value = "每页行数：空值或不传，默认返回所有值",example = "1")
    private String size;

    /**
     * 模糊查找名称（仅右模糊）
     */
    @ApiModelProperty(value = "模糊查找名称（仅右模糊）",example = "")
    private String bluredCompanyName;
}
