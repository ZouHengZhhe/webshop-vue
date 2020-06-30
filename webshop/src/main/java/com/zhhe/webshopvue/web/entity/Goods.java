package com.zhhe.webshopvue.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    //封面图片
    private String cover;

    //详情图片1
    private String image1;

    //详情图片2
    private String image2;

    //价格
    private Float price;

    //简介
    private String intro;

    //库存
    private Integer stock;

    private Integer typeId;


}
