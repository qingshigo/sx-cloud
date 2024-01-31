package cn.sx.cloud.framework.web.config;

import cn.sx.cloud.framework.web.core.handler.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author shenxin
 */
@AutoConfiguration
@EnableConfigurationProperties(WebProperties.class)
public class WebAutoConfiguration implements WebMvcConfigurer {

    @Resource
    private WebProperties webProperties;


    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        // 管理员相关接口
        configurePathMatch(configurer,webProperties.getAdminApi());
        // 应用相关接口
        configurePathMatch(configurer,webProperties.getAppApi());
    }


    /**
     * 设置 API 前缀，仅仅匹配 controller 包下的
     *
     * @param configurer 配置
     * @param api        API 配置
     */
    private void configurePathMatch(PathMatchConfigurer configurer, WebProperties.Api api) {
        AntPathMatcher antPathMatcher = new AntPathMatcher(".");
        configurer.addPathPrefix(api.getPrefix(), clazz -> clazz.isAnnotationPresent(RestController.class)
                && antPathMatcher.match(api.getController(), clazz.getPackage().getName())); // 仅仅匹配 controller 包
    }

    @Bean
    public GlobalExceptionHandler globalResponseBodyHandler() {
        return new GlobalExceptionHandler();
    }
}
