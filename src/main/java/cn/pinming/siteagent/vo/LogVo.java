package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :14:17
 * @Description: 日志信息
 */
@ApiModel("日志信息")
@Data
public class LogVo {

    @ApiModelProperty(value = "主键",example = "主键")
    private Integer id;

    @ApiModelProperty(value = "操作人",example = "操作人")
    private String operateAgentId;

    @ApiModelProperty(value = "被操作企业",example = "被操作企业")
    private Integer operationCompanyId;

    @ApiModelProperty(value = "被操作项目id",example = "被操作项目id")
    private Integer operationProjectId;

    @ApiModelProperty(value = "操作人姓名",example = "操作人姓名")
    private String operateAgentName;

    @ApiModelProperty(value = "被操作企业名称",example = "被操作企业名称")
    private String operationCompanyName;

    @ApiModelProperty(value = "被操作项目名称",example = "被操作项目名称")
    private String operationProjectName;

    @ApiModelProperty(value = "0 代理商管理 1 产品管理 2 代理商企业管理 3 代理商项目管理 4 产品授权",example = "0 代理商管理 1 产品管理 2 代理商企业管理 3 代理商项目管理 4 产品授权")
    private Byte operationType;

    @ApiModelProperty(value = "操作详细类型：0 新增 1 更新 2 删除",example = "操作详细类型：0 新增 1 更新 2 删除")
    private Byte operationTypeDetail;

    @ApiModelProperty(value = "日志备注",example = "日志备注")
    private String operationRemark;

    @ApiModelProperty(value = "创建时间",example = "创建时间")
    private Long timestampCreate;

    @ApiModelProperty(value = "修改时间",example = "修改时间")
    private Long timestampModify;
}
