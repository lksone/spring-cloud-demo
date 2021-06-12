package com.lks.demo.consul.controller;

import com.lks.demo.consul.domain.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 12:59
 */
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    private final RestTemplate restTemplate;


    private final DiscoveryClient discoveryClient;

    @Autowired
    public OrderController(RestTemplate restTemplate, DiscoveryClient discoveryClient) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
    }


    @GetMapping("/goods/{id}")
    public Goods findOne(@PathVariable("id") int id) {
        //获取实例
        List<ServiceInstance> instances = discoveryClient.getInstances("consul-provider");
        if (!CollectionUtils.isEmpty(instances)) {
            ServiceInstance serviceInstance = instances.get(0);
            String host = serviceInstance.getHost();
            int port = serviceInstance.getPort();

            String url = "http://" + host + ":" + port + "/goods/findOne/" + id;
            // 3. 调用方法
            Goods goods = restTemplate.getForObject(url, Goods.class);
            return goods;
        }
        return null;
    }
}
