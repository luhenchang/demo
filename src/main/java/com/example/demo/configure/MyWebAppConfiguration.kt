package com.example.demo.configure

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

/**
 * @program: appbuilder
 * @description:
 * @author: luhenchang  video
 * @create: 2018-12-26 19:50
 */
@Configuration
class MyWebAppConfiguration : WebMvcConfigurationSupport() {
    /**
     * @Description:
     * 对文件的路径进行配置, 创建一个虚拟路径/Path/ **
     */
    public override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/path/**")
            .addResourceLocations("file:/home/img/")
        super.addResourceHandlers(registry)
    }
}