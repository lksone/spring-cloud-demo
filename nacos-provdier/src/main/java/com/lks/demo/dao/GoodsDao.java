package com.lks.demo.dao;

import com.lks.demo.domain.Goods;
import org.springframework.stereotype.Repository;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 19:13
 */
@Repository
public class GoodsDao {

    public Goods findOne(int id) {
        return new Goods(1, "华为手机", 3999, 10000);
    }
}
