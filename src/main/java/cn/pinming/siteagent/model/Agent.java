package cn.pinming.siteagent.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Agent {
    private Integer id;

    @ApiModelProperty("关联桩桩用户id")
    private String memberId;

    @ApiModelProperty("关联桩桩企业id")
    private Integer companyId;

    @ApiModelProperty("代理商状态： 0 正常 1禁用 2删除")
    private Byte status;

    @ApiModelProperty("代理商类型：0 全国代理商1 区域代理商")
    private Byte type;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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