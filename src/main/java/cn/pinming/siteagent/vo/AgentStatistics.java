package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :11:23
 * @Description:
 */
@ApiModel(description = "代理商统计数据")
@Data
@Transactional()
public class AgentStatistics {

    /**
     * 认证的总数
     */
    @ApiModelProperty(value = "认证的总数",example = "认证的总数")
    private Integer authenticatedQuantity;

    /**
     * 今年认证的公司总数
     */
    @ApiModelProperty(value = "今年认证的总数",example = "今年认证的总数")
    private Integer currentYearOfAuthenticatedQuantity;
}
