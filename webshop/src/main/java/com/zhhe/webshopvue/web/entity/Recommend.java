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
public class Recommend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer goodsId;

    /**
     * 推荐类型(1条幅/2热销/3新品)
     */
    private Integer type;


}
