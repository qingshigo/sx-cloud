package cn.sx.cloud.module.system.api.user;

import cn.hutool.core.bean.BeanUtil;
import cn.sx.cloud.framework.common.pojo.CommonResult;
import cn.sx.cloud.module.api.system.user.AdminUserApi;
import cn.sx.cloud.module.api.system.user.dto.AdminUserTestDTO;
import cn.sx.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.sx.cloud.module.system.dal.mysql.user.AdminUserMapper;
import com.alibaba.fastjson2.JSON;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author shenxin
 */
@RestController
public class AdminUserApiImpl implements AdminUserApi {
}
