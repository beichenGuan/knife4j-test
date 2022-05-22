package com.github.xiaoymin.knife4j.controller;

import com.github.xiaoymin.knife4j.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Api(tags = "用户模块")
@RestController
@RequestMapping("/system/oper/v2/")
public class UserController {

    @ApiImplicitParam(name = "userId",value = "用户id",required = true)
    /**
     * value:接口名称;
     * consumes:请求数据类型(bug);
     * produces:响应数据类型;
     * notes:接口描述
     */
    @ApiOperation(value = "用户查询",consumes = "http/json/xml",produces = "application/json",notes = "0101010101")
    @GetMapping("/select")
    public String sayHi(@RequestParam(value = "userId")String userId){
        return userId;
    }

}
