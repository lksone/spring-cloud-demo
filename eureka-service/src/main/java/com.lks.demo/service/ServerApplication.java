package com.lks.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 开启eureka service
 * <p>
 * http://localhost:8761/  访问注册的地址
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/10 21:49
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ServerApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        log.info("环境：{},端口：{}", environment.getProperty("os.name"), environment.getProperty("server.port"));
    }
}
