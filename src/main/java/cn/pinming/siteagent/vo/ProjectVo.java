package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :10:45
 * @Description: 项目视图展示
 */
@ApiModel(description = "项目信息")
@Data
public class ProjectVo {

    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID",example ="项目ID" )
    private Integer projectId;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称",example = "项目名称")
    private String projectName;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址",example = "详细地址")
    private String address;

    /**
     * 项目类型
     */
    @ApiModelProperty(value = "项目类型",example = "项目类型")
    private int projectType;

    /**
     * 所属企业（企业id）
     */
    @ApiModelProperty(value = "所属企业（企业id）",example = "所属企业（企业id）")
    private String company;

    /**
     * 项目创建人
     */
    @ApiModelProperty(value = "创建人",example = "创建人")
    private String creater;

    /**
     * 项目负责人
     */
    @ApiModelProperty(value = "项目负责人",example = "项目负责人")
    private String manager;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间时间戳",example = "创建时间时间戳")
    private Long createTime;
}
