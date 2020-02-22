package cn.pinming.siteagent.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class AgentCompany {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("代理商id")
    private Integer agentId;

    @ApiModelProperty("桩桩企业id")
    private Integer companyId;

    @ApiModelProperty("状态：0 正常 1冻结 2删除")
    private Byte status;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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