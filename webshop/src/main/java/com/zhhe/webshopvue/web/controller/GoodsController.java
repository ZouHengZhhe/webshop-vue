package com.zhhe.webshopvue.web.controller;


import com.zhhe.webshopvue.web.entity.Goods;
import com.zhhe.webshopvue.web.model.vo.RestVo;
import com.zhhe.webshopvue.web.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-28
 */
@RestController
@RequestMapping("/fore")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping("goods")
    public RestVo goodsList() {
        return RestVo.SUCCESS(goodsService.list());
    }

    @PostMapping("goods")
    public RestVo addGoods(Goods goods) {
        return goodsService.save(goods) ? RestVo.SUCCESS() : RestVo.FAIL();
    }

    @DeleteMapping("goods/id")
    public RestVo deleteById(Integer id) {
        return goodsService.removeById(id) ? RestVo.SUCCESS() : RestVo.FAIL();
    }

    /**
     * 获取横幅商品
     * @return
     */
    @GetMapping("goods/banner")
    public RestVo getBannerGoods(){
        return RestVo.SUCCESS(goodsService.findBannerGoods());
    }

    /**
     * 获取热销商品
     * @return
     */
    @GetMapping("goods/hot")
    public RestVo getHotGoods(){
        return RestVo.SUCCESS(goodsService.findHotGoods());
    }

    /**
     * 获取新品商品
     * @return
     */
    @GetMapping("goods/new")
    public RestVo getNewGoods(){
        return RestVo.SUCCESS(goodsService.findNewGoods());
    }

    @GetMapping("goods/id")
    public RestVo getGoodsById(Integer id){
        return RestVo.SUCCESS(goodsService.getById(id));
    }
}
