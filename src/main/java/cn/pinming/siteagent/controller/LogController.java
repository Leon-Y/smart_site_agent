package cn.pinming.siteagent.controller;

import cn.pinming.siteagent.bo.LogBo;
import cn.pinming.siteagent.common.response.Response;
import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.vo.LogVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :13:57
 * @Description:
 */
@RestController("/log")
@Api(description = "日志接口")
public class LogController {

    /**
     * 获取日志
     *
     * @return
     */
    @ApiOperation("获取日志内容")
    @PostMapping("/logDetail")
    public ResponseEntity<SuccessResponse<List<LogVo>>> getLog(@ApiParam("日志定义") LogBo logBo) {
        return ResponseEntity.ok(new SuccessResponse(null));
    }
}
