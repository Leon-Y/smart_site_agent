package cn.pinming.siteagent.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:24
 * @Description: 项目信息
 */
@ApiModel(description = "项目信息")
@Data
public class ProjectBo {

    /**
     * 项目标题
     */
    @ApiModelProperty(value = "项目标题",example = "项目标题",required = true)
    private String projectTitle;

    /**
     * 项目别名
     */
    @ApiModelProperty(value = "项目别名",example = "项目别名",required = true)
    private String aliasProjectTitle;

    /**
     * 建设规模 1 小型 2 中型 3 大型
     */
    @ApiModelProperty(value = "建设规模 1 小型 2 中型 3 大型",example = "建设规模 1 小型 2 中型 3 大型",required = true)
    private byte scale;

    /**
     * 项目类型 1-房建项目 2-市政项目 3-专业工程 4-其他
     */
    @ApiModelProperty(value = "项目类型 1-房建项目 2-市政项目 3-专业工程 4-其他",example = "项目类型 1-房建项目 2-市政项目 3-专业工程 4-其他",required = true)
    private Integer projectType;

    /**
     *  项目logo
     */
    @ApiModelProperty(value = "项目logo",example = "项目logo",required = true)
    private String projectLogo;

    /**
     * 状态：1-在建 2-完成 3-删除
     */
    @ApiModelProperty(value = "状态：1-在建 2-完成 3-删除",example = "状态：1-在建 2-完成 3-删除",required = true)
    private Byte status;

    /**
     * 项目负责人id
     */
    @ApiModelProperty(value = "项目负责人id",example = "项目负责人id",required = true)
    private String memberId;

    /**
     *  项目定位x
     */
    @ApiModelProperty(value = "项目定位x",example = "项目定位x",required = true)
    private Double pointx;

    /**
     *  项目定位y
     */
    @ApiModelProperty(value = "项目定位y",example = "项目定位y",required = true)
    private Double pointy;

    /**
     *  投资总额（万元）
     */
    @ApiModelProperty(value = "投资总额（万元）",example = "投资总额（万元）",required = true)
    private String investAmount;

}
