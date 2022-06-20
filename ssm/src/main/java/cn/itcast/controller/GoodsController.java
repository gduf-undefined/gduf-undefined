package cn.itcast.controller;

import cn.itcast.domain.Goods;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 商品控制器
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //查询所有商品
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有商品...");
        // 调用service的方法
        List<Goods> list = goodsService.findAll();
        model.addAttribute("list",list);
        return "findAll";
    }

    //根据Name查询商品
    @RequestMapping("/findByName")
    public String findByName(Model model,Goods goods){
        System.out.println("表现层：根据Name查询商品...");
        // 调用service的方法
        List<Goods> list = goodsService.findByName(goods);
        model.addAttribute("list",list);
        return "findByName";
    }

    //根据id查询商品
    @RequestMapping("/findById")
    public String findById(Model model,Goods goods){
        System.out.println("表现层：根据Id查询商品...");
        // 调用service的方法
        Goods goods1 = goodsService.findById(goods);
        model.addAttribute("goods1",goods1);
        return "findById";
    }


    //更新商品（并返回商品的新信息）
    @RequestMapping("/updateGoods")
    public String updateGoods(Model model,Goods goods){
        System.out.println("表现层：更新商品...");
        // 调用service的方法
        goodsService.updateGoods(goods);
        Goods goods1 = goodsService.findById(goods);
        model.addAttribute("goods1",goods1);
        return "updateGoods";
    }


    //添加新商品（并返回新商品信息）
    @RequestMapping("/saveGoods")
    public String saveGoods(Model model,Goods goods){
        System.out.println("表现层：添加新商品...");
        // 调用service的方法
        goodsService.saveGoods(goods);
        Goods goods1 = goodsService.findById(goods);
        model.addAttribute("goods1",goods1);
        return "saveGoods";
    }


    //删除商品（并返回被删除的商品信息）
    @RequestMapping("/deleteGoods")
    public String deleteGoods(Model model,Goods goods) {
        System.out.println("表现层：删除商品...");
        model.addAttribute("goods",goods);
        goodsService.deleteGoods(goods);
        return "deleteGoods";
    }

}
