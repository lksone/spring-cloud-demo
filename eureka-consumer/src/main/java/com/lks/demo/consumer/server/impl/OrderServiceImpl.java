package com.lks.demo.consumer.server.impl;

import com.lks.demo.consumer.entitys.Goods;
import com.lks.demo.consumer.server.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/10 17:05
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Override
    public List<Goods> getList() {
        return null;
    }
}
