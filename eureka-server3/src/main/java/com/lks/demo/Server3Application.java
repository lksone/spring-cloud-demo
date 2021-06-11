package com.lks.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Hello world!
 */
@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class Server3Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Server3Application.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        log.info("环境：{},端口：{}", environment.getProperty("os.name"), environment.getProperty("server.port"));
    }
}
