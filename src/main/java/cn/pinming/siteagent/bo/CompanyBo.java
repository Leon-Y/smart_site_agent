package cn.pinming.siteagent.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :9:24
 * @Description: 企业信息
 */
@ApiModel(description = "企业信息")
@Data
public class CompanyBo {


    /**
     * 企业名称
     */
    @NotNull(message = "企业名称不能为空")
    @Size(min = 1,max = 20,message = "企业名称长度必须大于等于{min},小于等于{max}")
    @ApiModelProperty(value = "企业名称",example = "测试企业",required = true)
    private String companyName;

    /**
     * 企业城市名称
     */
    @ApiModelProperty(value = "企业城市名称",example = "浙江杭州",required = true)
    private String cityName;

    /**
     * 企业类型(1.专业分包2.设备分包3.材料分包4.后勤服务5.特殊设备6.劳务分包7.监理8.建设单位9.总承包单位10.勘察11.设计单位12.租赁13.其他)
     */
    @ApiModelProperty(value = "企业类型(1.专业分包2.设备分包3.材料分包4.后勤服务5.特殊设备6.劳务分包7.监理8.建设单位9.总承包单位10.勘察11.设计单位12.租赁13.其他)",example = "1",required = true)
    private Byte companyType;

    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名",example = "羊羊羊",required = true)
    private String contactsName;

    /**
     * 联系人手机号
     */
    @ApiModelProperty(value = "联系人手机号",example = "123456789",required = true)
    private String contactsMobile;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址",example = "杭州市西斗门",required = true)
    private String address;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "管理员用户id",example = "1234-567",required = true)
    private String memId;

}
