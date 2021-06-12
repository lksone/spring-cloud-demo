package com.lks.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 18:20
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

    private int id;

    private String title;

    private double price;

    private int count;
}
