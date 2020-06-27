package com.zhhe.webshopvue.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * User与Role是一对多关心，一个User只能有一种Role
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer roleId;

    private String username;

    private String password;

    private String salt;

    private String mobile;

    private String email;

    private String weixinOpenid;

    private LocalDateTime createDate;

    private String sex;

}
