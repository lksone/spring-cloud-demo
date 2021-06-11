package com.lks.demo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 *
 * restTmep的远程调用的方式和方法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/10 17:16
 */
@Configuration
public class RestTemplateConfig {


    @Bean
    @Primary
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
