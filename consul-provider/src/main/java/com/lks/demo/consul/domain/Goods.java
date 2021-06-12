package com.lks.demo.consul.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 00:27
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private int id;
    //商品标题
    private String title;
    //商品价格
    private double price;

    //商品库存
    private int count;

}
