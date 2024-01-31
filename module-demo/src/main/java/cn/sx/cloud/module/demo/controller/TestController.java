package cn.sx.cloud.module.demo.controller;

import cn.sx.cloud.framework.common.pojo.CommonResult;
import cn.sx.cloud.module.api.system.user.dto.AdminUserTestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("demo/test")
@Slf4j
public class TestController {

    @Resource
    private OpenFeignTestClient openFeignTestClient;

    @PostMapping("array")
    public CommonResult<Long[]> array(@RequestBody Long[] ids){
        return CommonResult.success(ids);
    }
}
