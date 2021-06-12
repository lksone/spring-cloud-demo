package com.lks.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 00:16
 */
@SpringBootApplication
@Slf4j
public class ConsulConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsulConsumerApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        log.info("当前环境：{} \n", environment.getProperty("os.name"));
        log.info("端口号：{} \n", environment.getProperty("server.port"));
    }
}
