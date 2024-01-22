package com.example.demo.configure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import tk.mybatis.spring.mapper.MapperScannerConfigurer
import java.util.*

/**
 *
 * @author luhenchang
 */
@Configuration
class MapperScannerConfig {
    @Bean
    fun mapperScannerConfigurer(): MapperScannerConfigurer {
        val mapperScannerConfigurer = MapperScannerConfigurer()
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory")
        mapperScannerConfigurer.setBasePackage("com.example.demo.dao")
        val properties = Properties()
        properties.setProperty("mappers", "com.example.demo.utills.BaseDao")
        properties.setProperty("notEmpty", "false")
        properties.setProperty("IDENTITY", "MYSQL")
        mapperScannerConfigurer.setProperties(properties)
        return mapperScannerConfigurer
    }
}
