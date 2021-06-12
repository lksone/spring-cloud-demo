package com.lks.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 18:18
 */
@Configuration
public class RestTemplateConfig {


    @Bean
    @Primary
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
