package cn.pinming.siteagent.controller;

import cn.pinming.siteagent.bo.AuthorizingBo;
import cn.pinming.siteagent.bo.CommonBo;
import cn.pinming.siteagent.bo.ProjectBo;
import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.vo.AgentStatistics;
import cn.pinming.siteagent.vo.Pagination;
import cn.pinming.siteagent.vo.ProjectVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :8:50
 * @Description:
 */
@RestController("/project")
@Api(description = "代理商授权项目管理")
public class AgentProjectController {
    /**
     * 新增项目
     * @return
     */
    @PostMapping("/addProject")
    @ApiOperation("新增项目")
    public ResponseEntity<SuccessResponse> creatNewProject(@ApiParam("项目信息") ProjectBo ProjectBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 修改项目
     * @return
     */
    @ApiOperation("更新项目")
    @PostMapping("/updateProject")
    public ResponseEntity<SuccessResponse> updateNewProject(@ApiParam("项目信息") ProjectBo ProjectBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 解散项目
     * @param proId
     * @return
     */
    @PostMapping("/dissolutionProject")
    @ApiOperation("删除项目")
    public ResponseEntity<SuccessResponse> dissolutionProject(@ApiParam("项目id") int proId){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 获取代理商管理的项目
     * @return
     */
    @PostMapping("/listProject")
    @ApiOperation("获取代理商管理的项目")
    public ResponseEntity<SuccessResponse<Pagination<ProjectVo>>> listAgentProject(@ApiParam("分页查询参数") CommonBo commonBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    /**
     * 代理商统计项目信息
     * @return
     */
    @PostMapping("/agentProjectStatistics")
    @ApiOperation("代理商统计信息：授权项目总数，当年授权项目总数")
    public ResponseEntity<SuccessResponse<AgentStatistics>> agentStatistics(){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    @PostMapping("/authorize")
    @ApiOperation("项目授权")
    public ResponseEntity<SuccessResponse> authorizeProject(@ApiParam("授权内容")AuthorizingBo authorizingBo){
        return ResponseEntity.ok(new SuccessResponse(null));
    }
}
