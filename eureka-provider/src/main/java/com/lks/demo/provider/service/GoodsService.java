package com.lks.demo.provider.service;

import com.lks.demo.provider.entitys.Goods;

import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/9 00:10
 */
public interface GoodsService {

    /**
     * 查询
     *
     * @return
     */
    List<Goods> getGoodsList();
}
