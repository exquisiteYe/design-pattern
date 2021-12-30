package xyDemo.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"xyDemo"})
@MapperScan(basePackages = {"xyDemo"})
public class MyApplication {
    /**
     * @param args spring boot 启动器
     */
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
