package com.lks.demo.consul.server;

import com.lks.demo.consul.dao.GoodsDao;
import com.lks.demo.consul.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 00:26
 */
@Service
public class GoodsService {


    @Autowired
    private GoodsDao goodsDao;


    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public Goods findOne(int id) {
        return goodsDao.findOne(id);
    }
}
