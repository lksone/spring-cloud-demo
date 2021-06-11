package com.lks.demo.consumer.controller;

import com.lks.demo.consumer.entitys.Goods;
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
 * @Date 2021/6/10 11:12
 */
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {


    private final RestTemplate template;
    private final DiscoveryClient discoveryClient;

    @Autowired
    public OrderController(RestTemplate template, DiscoveryClient discoveryClient) {
        this.template = template;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/goods/{id}")
    public List<Goods> findGoodsById(@PathVariable("id") int id) {
        System.out.println("findGoodsById..." + id);

        //动态获取eureka的注入的实例对象 (实例名称就是server的配置的名称)
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        //获取集合失败
        if (CollectionUtils.isEmpty(instances)) {
            //集合没有数据
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        log.info("获取到的地址集合:{}", host + ":" + port);
        String url = "http://" + host + ":" + port + "/springcloud/goods/findOne/" + id;
        // 3. 调用方法
        List<Goods> forObject = template.getForObject(url, List.class);
        //远程调用Goods服务中的findOne接口
        return forObject;
    }

}
