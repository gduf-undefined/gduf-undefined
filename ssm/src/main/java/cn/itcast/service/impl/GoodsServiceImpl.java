package cn.itcast.service.impl;

import cn.itcast.dao.GoodsDao;
import cn.itcast.domain.Goods;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;


    //查询所有的商品
    public List<Goods> findAll() {
        System.out.println("业务层：查询所有商品...");
        return goodsDao.findAll();

    }

    //根据name查询商品
    public List<Goods> findByName(Goods goods) {
        System.out.println("业务层：根据Name查找商品...");
        return goodsDao.findByName(goods.getName());
    }

    //根据id查询商品
    public Goods findById(Goods goods) {
        System.out.println("业务层：根据Id查找商品...");
        return goodsDao.findById(goods.getId());
    }

    //更新商品
    public void updateGoods(Goods goods) {
        System.out.println("业务层：更新商品...");
        goodsDao.updateGoods(goods);

    }

    //添加新商品
    public void saveGoods(Goods goods) {
        System.out.println("业务层：保存新商品...");
        goodsDao.saveGoods(goods);
        return;
    }

    //删除商品
    public void deleteGoods(Goods goods) {
        System.out.println("业务层：删除商品...");
        goodsDao.deleteGoods(goods.getId());
        return;
    }
}
