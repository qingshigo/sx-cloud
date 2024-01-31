package cn.sx.cloud.module.api.system.user;


import cn.sx.cloud.framework.common.pojo.CommonResult;
import cn.sx.cloud.module.api.system.user.dto.AdminUserTestDTO;
import cn.sx.cloud.module.enums.ApiConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shenxin
 */
public interface AdminUserApi {

    String PREFIX = ApiConstants.PREFIX + "/user";

    // todo : https://www.iocoder.cn/Spring-Cloud/Feign/?yudao
}
