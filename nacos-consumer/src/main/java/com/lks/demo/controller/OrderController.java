package com.lks.demo.controller;

import com.lks.demo.domain.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
 * @Date 2021/6/12 18:19
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {


    private final RestTemplate restTemplate;

    private final DiscoveryClient discoveryClient;

    @Autowired
    public OrderController(RestTemplate restTemplate, DiscoveryClient discoveryClient) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {
        //演示discoveryClient 使用
        List<ServiceInstance> instances = discoveryClient.getInstances("nacos-provdier");
        //判断集合是否有数据
        if (instances == null || instances.size() == 0) {
            //集合没有数据
            return null;
        }
        ServiceInstance instance = instances.get(0);
        String host = instance.getHost();
        int port = instance.getPort();

        log.info("地址和端口好：{}，{}", host, port);

        String url = "http://" + host + ":" + port + "/goods/findOne/" + id;
        // 3. 调用方法
        Goods goods = restTemplate.getForObject(url, Goods.class);
        return goods;
    }
}