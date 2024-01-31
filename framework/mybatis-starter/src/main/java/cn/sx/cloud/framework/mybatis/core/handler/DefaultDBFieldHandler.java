package cn.sx.cloud.framework.mybatis.core.handler;

import cn.sx.cloud.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 通用参数填充实现类
 * 如果没有显式的对通用参数进行赋值，这里会对通用参数进行填充、赋值
 * @author shenxin
 */
public class DefaultDBFieldHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        BaseDO baseDO = (BaseDO) metaObject.getOriginalObject();

        LocalDateTime current = LocalDateTime.now();
        // 创建时间为空，则以当前时间为插入时间
        if (Objects.isNull(baseDO.getCreateTime())) {
            baseDO.setCreateTime(current);
        }
        // 更新时间为空，则以当前时间为更新时间
        if (Objects.isNull(baseDO.getUpdateTime())) {
            baseDO.setUpdateTime(current);
        }
        // todo: 用户登录功能完成后设置 创建者 id 修改者id
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 更新时间为空，则以当前时间为更新时间
        Object modifyTime = getFieldValByName("updateTime", metaObject);
        if (Objects.isNull(modifyTime)) {
            setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        }

        // todo: 用户登录功能完成后设置 修改者id
    }
}
