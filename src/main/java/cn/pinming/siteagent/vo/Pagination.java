package cn.pinming.siteagent.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/12/10 :11:18
 * @Description:
 */
@Data
@ApiModel
public class Pagination<T> {
    /**
     * 页码
     */
    @ApiModelProperty(value = "页码",example = "页码")
    private Integer page;
    /**
     * 每页行数
     */
    @ApiModelProperty(value = "每页行数",example = "每页行数")
    private Integer size;
    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数",example = "总页数")
    private Integer totalPage;
    /**
     * 总行数
     */
    @ApiModelProperty(value = "总行数",example = "总行数")
    private Integer totalRows;
    /**
     * 结果列表
     */
    @ApiModelProperty(value = "结果列表",example = "结果列表")
    private List<T> list;
}
