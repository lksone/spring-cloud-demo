package com.lks.demo.server;

import com.lks.demo.dao.GoodsDao;
import com.lks.demo.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/6/12 19:11
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
