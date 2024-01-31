package cn.sx.cloud.module.system.dal.mysql.user;

import cn.sx.cloud.framework.mybatis.core.mapper.BaseMapperX;
import cn.sx.cloud.module.system.dal.dataobject.user.AdminUserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shenxin
 */
@Mapper
public interface AdminUserMapper extends BaseMapperX<AdminUserDO> {
}
