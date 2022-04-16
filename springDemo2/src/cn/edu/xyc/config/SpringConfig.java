package cn.edu.xyc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//利用注解的方式配置spring
@Configuration
@ComponentScan(basePackages = "cn.edu.xyc")//组件扫描
public class SpringConfig {
}
