package com.zhhe.webshopvue.web.service;

import com.zhhe.webshopvue.web.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhhe.webshopvue.web.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-28
 */
public interface IGoodsService extends IService<Goods> {
    Goods findBannerGoods();
    List<Goods> findHotGoods();
    List<Goods> findNewGoods();
}
