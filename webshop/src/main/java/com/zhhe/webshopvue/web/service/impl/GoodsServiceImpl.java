package com.zhhe.webshopvue.web.service.impl;

import com.zhhe.webshopvue.web.entity.Goods;
import com.zhhe.webshopvue.web.mapper.GoodsMapper;
import com.zhhe.webshopvue.web.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-28
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods findBannerGoods() {
        return goodsMapper.findBannerGoods();
    }

    @Override
    public List<Goods> findHotGoods() {
        return goodsMapper.findHotGoods();
    }

    @Override
    public List<Goods> findNewGoods() {
        return goodsMapper.findNewGoods();
    }
}
