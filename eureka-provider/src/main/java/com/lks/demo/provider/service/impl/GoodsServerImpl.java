package com.lks.demo.provider.service.impl;

import com.lks.demo.provider.entitys.Goods;
import com.lks.demo.provider.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/9 00:11
 */
@Service
public class GoodsServerImpl implements GoodsService {


    @Override
    public List<Goods> getGoodsList() {

        List<Goods> list = new ArrayList<>();

        Goods goods = new Goods();
        goods.setId(1);
        goods.setCount(1);
        goods.setTitle("fdsa");
        list.add(goods);

        return list;
    }
}
