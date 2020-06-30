package com.zhhe.webshopvue.web.controller;


import com.zhhe.webshopvue.web.entity.GoodsType;
import com.zhhe.webshopvue.web.model.vo.RestVo;
import com.zhhe.webshopvue.web.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZouHeng
 * DES:商品类型控制器
 * @since 2020-06-28
 */
@RestController
@RequestMapping("/fore")
public class GoodsTypeController {
    @Autowired
    private IGoodsTypeService goodsTypeService;

    @GetMapping("goodsTypes")
    public RestVo goodsTypeList(){
        List<GoodsType> list = goodsTypeService.list();
        return RestVo.SUCCESS(list);
    }

}
