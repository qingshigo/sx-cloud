package cn.sx.cloud.module.demo.controller;

import cn.sx.cloud.module.api.system.user.AdminUserApi;
import cn.sx.cloud.module.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface OpenFeignTestClient extends AdminUserApi {
}
