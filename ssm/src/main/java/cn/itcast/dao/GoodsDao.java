package cn.itcast.dao;

import cn.itcast.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品dao接口
 */
@Repository
public interface GoodsDao {

    // 查询所有商品
    @Select("select * from goods")
    public List<Goods> findAll();

    // 根据Name查询商品
    @Select("select * from goods where name = #{name}")
    public List<Goods> findByName(String name);

    // 根据Id查询商品
    @Select("select * from goods where id = #{id}")
    public Goods findById(int id);

    // 更新商品
    @Update("update goods set name=#{name},price=#{price} where id=#{id}")
    public void updateGoods(Goods goods);

    // 把新商品插入数据库
    @Insert("insert into goods(id,name,price)values(#{id},#{name},#{price})")
    public void saveGoods(Goods goods);

    // 删除商品
    @Delete("delete from goods where id= #{id}")
    public void deleteGoods(int id);

}
