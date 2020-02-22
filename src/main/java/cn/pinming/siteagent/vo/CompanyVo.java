package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :10:45
 * @Description: 企业视图展示
 */
@ApiModel(description = "企业信息")
@Data
public class CompanyVo {

    /**
     * 企业ID
     */
    @ApiModelProperty("企业ID")
    private Integer companyId;

    /**
     * 企业详细地址
     */
    @ApiModelProperty(value = "企业详细地址",example = "企业详细地址")
    private String companyName;

    /**
     * 企业类型(1.专业分包2.设备分包3.材料分包4.后勤服务5.特殊设备6.劳务分包7.监理8.建设单位9.总承包单位10.勘察11.设计单位12.租赁13.其他)
     */
    @ApiModelProperty(value = "企业类型(1.专业分包2.设备分包3.材料分包4.后勤服务5.特殊设备6.劳务分包7.监理8.建设单位9.总承包单位10.勘察11.设计单位12.租赁13.其他)"
    ,example = "企业类型(1.专业分包2.设备分包3.材料分包4.后勤服务5.特殊设备6.劳务分包7.监理8.建设单位9.总承包单位10.勘察11.设计单位12.租赁13.其他)")
    private Byte companyType;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址",example = "详细地址")
    private String address;
    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名",example = "联系人姓名")
    private String contactsName;
    /**
     * 联系人手机号
     */
    @ApiModelProperty(value = "联系人手机号",example = "联系人手机号")
    private String contactsMobile;

    /**
     * 超级管理员姓名（通信证号）
     */
    @ApiModelProperty(value = "超级管理员姓名（通信证号）",example = "超级管理员姓名（通信证号）")
    private String administrator;

    /**
     * 企业创建人
     */
    @ApiModelProperty(value = "创建人",example = "创建人")
    private String creater;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间时间戳",example = "创建时间时间戳")
    private Long createTime;
}
