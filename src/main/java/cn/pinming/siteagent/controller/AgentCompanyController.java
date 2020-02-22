package cn.pinming.siteagent.controller;

import cn.pinming.siteagent.bo.CommonBo;
import cn.pinming.siteagent.bo.CompanyBo;
import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.vo.AgentStatistics;
import cn.pinming.siteagent.vo.CompanyVo;
import cn.pinming.siteagent.vo.Pagination;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 36560
 * @Date: 2020/2/18 :21:23
 * @Description:
 */
@RestController("/company")
@Api(description = "代理商授权企业管理")
public class AgentCompanyController {

    /**
     * 新增企业
     * @return
     */
    @PostMapping("/addCompany")
    @ApiOperation("新增企业")
    public ResponseEntity<SuccessResponse> creatNewCompany(@ApiParam("企业信息") CompanyBo companyBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 修改企业
     * @return
     */
    @ApiOperation("更新企业")
    @PostMapping("/updateCompany")
    public ResponseEntity<SuccessResponse> updateNewCompany(@ApiParam("企业信息") CompanyBo companyBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 解散企业
     * @param coId
     * @return
     */
    @PostMapping("/dissolutionCompany")
    @ApiOperation("解散企业")
    public ResponseEntity<SuccessResponse> dissolutionCompany(@ApiParam("企业id") int coId){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 获取代理商管理的企业
     * @return
     */
    @PostMapping("/listCompany")
    @ApiOperation("获取代理商管理的企业")
    public ResponseEntity<SuccessResponse<Pagination<CompanyVo>>> listAgentCompany(@ApiParam("分页查询参数") CommonBo commonBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 代理商统计企业信息
     * @return
     */
    @ApiOperation("代理商统计信息：授权企业总数，当年授权企业总数")
    @PostMapping("/agentCompanyStatistics")
    public ResponseEntity<SuccessResponse<AgentStatistics>> agentStatistics(){
        return ResponseEntity.ok(new SuccessResponse(null));
    }
}

