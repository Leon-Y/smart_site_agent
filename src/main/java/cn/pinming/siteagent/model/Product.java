package cn.pinming.siteagent.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Product {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("状态：0 正常 1停用 3删除")
    private Byte type;

    @ApiModelProperty("产品类型：0 企业级 1 项目级")
    private Byte status;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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