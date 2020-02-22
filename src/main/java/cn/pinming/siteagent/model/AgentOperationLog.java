package cn.pinming.siteagent.model;

import java.util.Date;

public class AgentOperationLog {
    private Integer id;

    private String operationAgentId;

    private Integer operationCompanyId;

    private Integer operationProjectId;

    private String operationAgentName;

    private String operationCompanyName;

    private String operationProjectName;

    private Byte operationType;

    private Byte operationTypeDetail;

    private String operationRemark;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationAgentId() {
        return operationAgentId;
    }

    public void setOperationAgentId(String operationAgentId) {
        this.operationAgentId = operationAgentId == null ? null : operationAgentId.trim();
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

    public String getOperationAgentName() {
        return operationAgentName;
    }

    public void setOperationAgentName(String operationAgentName) {
        this.operationAgentName = operationAgentName == null ? null : operationAgentName.trim();
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