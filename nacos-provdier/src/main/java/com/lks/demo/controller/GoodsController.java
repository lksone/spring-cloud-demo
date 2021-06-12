package com.lks.demo.controller;

import com.lks.demo.domain.Goods;
import com.lks.demo.server.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 19:10
 */

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/findOne/{id}")
    public Goods findOne(@PathVariable("id") int id) {
        Goods goods = goodsService.findOne(id);
        return goods;
    }
}
