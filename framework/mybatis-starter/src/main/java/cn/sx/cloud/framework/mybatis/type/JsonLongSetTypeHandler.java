package cn.sx.cloud.framework.mybatis.type;


import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;

import java.util.HashSet;


/**
 * 参考 {@link com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler} 实现
 * 在我们将字符串反序列化为 Set 并且泛型为 Long 时，如果每个元素的数值太小，会被处理成 Integer 类型，导致可能存在隐性的 BUG。
 * <p>
 * 例如说哦，SysUserDO 的 postIds 属性
 *
 * @author 芋道源码
 */
public class JsonLongSetTypeHandler extends AbstractJsonTypeHandler<Object> {

    @Override
    protected Object parse(String json) {
        return new HashSet<>(JSON.parseArray(json, Long.class));
    }

    @Override
    protected String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }

}
