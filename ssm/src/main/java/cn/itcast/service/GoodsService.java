package cn.itcast.service;

import cn.itcast.domain.Goods;

import java.util.List;

public interface GoodsService {

    // 查询所有商品
    public List<Goods> findAll();

    //根据Name查询商品
    public  List<Goods> findByName(Goods goods);

    //根据Id查询商品
    public  Goods findById(Goods goods);

    //更新商品
    public  void updateGoods(Goods goods);

    //添加新商品
    public void saveGoods(Goods goods);

    //删除商品
    public  void deleteGoods(Goods goods);

}
