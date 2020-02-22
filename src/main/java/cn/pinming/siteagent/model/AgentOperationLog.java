package cn.pinming.siteagent.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class AgentOperationLog {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("操作人")
    private String operateUserId;

    @ApiModelProperty("被操作企业")
    private Integer operationCompanyId;

    @ApiModelProperty("被操作项目id")
    private Integer operationProjectId;

    @ApiModelProperty("操作人姓名")
    private String operateUserName;

    @ApiModelProperty("被操作企业名称")
    private String operationCompanyName;

    @ApiModelProperty("被操作项目名称")
    private String operationProjectName;

    @ApiModelProperty("操作类型：0 代理商管理 1 产品管理 2 代理商授权 3产品授权")
    private Byte operationType;

    @ApiModelProperty("操作详细类型：0 新增 1 更新 2 删除")
    private Byte operationTypeDetail;

    @ApiModelProperty("日志备注")
    private String operationRemark;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId == null ? null : operateUserId.trim();
    }

    public Integer getOperationCompanyId() {
        return operationCompanyId;
    }

    public void setOperationCompanyId(Integer operationCompanyId) {
        this.operationCompanyId = operationCompanyId;
    }

    public Integer getOperationProjectId() {
        return operationProjectId;
    }

    public void setOperationProjectId(Integer operationProjectId) {
        this.operationProjectId = operationProjectId;
    }

    public String getOperateUserName() {
        return operateUserName;
    }

    public void setOperateUserName(String operateUserName) {
        this.operateUserName = operateUserName == null ? null : operateUserName.trim();
    }

    public String getOperationCompanyName() {
        return operationCompanyName;
    }

    public void setOperationCompanyName(String operationCompanyName) {
        this.operationCompanyName = operationCompanyName == null ? null : operationCompanyName.trim();
    }

    public String getOperationProjectName() {
        return operationProjectName;
    }

    public void setOperationProjectName(String operationProjectName) {
        this.operationProjectName = operationProjectName == null ? null : operationProjectName.trim();
    }

    public Byte getOperationType() {
        return operationType;
    }

    public void setOperationType(Byte operationType) {
        this.operationType = operationType;
    }

    public Byte getOperationTypeDetail() {
        return operationTypeDetail;
    }

    public void setOperationTypeDetail(Byte operationTypeDetail) {
        this.operationTypeDetail = operationTypeDetail;
    }

    public String getOperationRemark() {
        return operationRemark;
    }

    public void setOperationRemark(String operationRemark) {
        this.operationRemark = operationRemark == null ? null : operationRemark.trim();
    }

    public Date getTimestampCreate() {
        return timestampCreate;
    }

    public void setTimestampCreate(Date timestampCreate) {
        this.timestampCreate = timestampCreate;
    }

    public Date getTimestampModify() {
        return timestampModify;
    }

    public void setTimestampModify(Date timestampModify) {
        this.timestampModify = timestampModify;
    }
}