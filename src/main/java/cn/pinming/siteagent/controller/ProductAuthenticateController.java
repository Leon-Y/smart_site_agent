package cn.pinming.siteagent.controller;

import cn.pinming.siteagent.common.response.Response;
import cn.pinming.siteagent.common.response.SuccessResponse;
import cn.pinming.siteagent.vo.ProductDetailVo;
import cn.pinming.siteagent.vo.ProductVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :8:51
 * @Description:
 */
@RestController("/productAuthenticate")
@Api(description = "产品授权")
public class ProductAuthenticateController {

    @PostMapping("/listProducts")
    @ApiOperation("获取所有产品列表")
    public ResponseEntity<SuccessResponse<List<ProductVo>>> listProducts(){
        return ResponseEntity.ok(new SuccessResponse(null));

    }

    @PostMapping("/listAgentProducts")
    @ApiOperation("获取代理商产品列表")
    public ResponseEntity<SuccessResponse<List<ProductVo>>> listAgentProducts(@ApiParam("代理商id")Integer agentId){
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    @PostMapping("/productDetail")
    @ApiOperation("获取产品的详情内容")
    public ResponseEntity<SuccessResponse<ProductDetailVo>> productDetail(@ApiParam("产品id")Integer productId){
        return ResponseEntity.ok(new SuccessResponse(null));
    }
}
