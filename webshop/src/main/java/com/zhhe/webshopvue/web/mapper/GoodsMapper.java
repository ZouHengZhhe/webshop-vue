package com.zhhe.webshopvue.web.mapper;

import com.zhhe.webshopvue.web.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-28
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    @Select("select * from goods g,recommend r where r.goods_id=g.id and r.type=1 order by r.id desc limit 1")
    Goods findBannerGoods();

    @Select("select * from goods g,recommend r where r.goods_id=g.id and r.type=3")
    List<Goods> findNewGoods();

    @Select("select * from goods g,recommend r where r.goods_id=g.id and r.type=2")
    List<Goods> findHotGoods();
}
