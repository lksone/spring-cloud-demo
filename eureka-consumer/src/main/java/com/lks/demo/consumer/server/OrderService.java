package com.lks.demo.consumer.server;

import com.lks.demo.consumer.entitys.Goods;

import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/10 17:05
 */
public interface OrderService {

    List<Goods> getList();
}
