package com.zhhe.webshopvue.web.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *Author:ZouHeng
 *Des:业务响应实体
 *Date:2020-06-28  15:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestVo
{
    private int code;
    private String msg;
    private Object result;

    public static RestVo SUCCESS(){
        return new RestVo(0,"success",null);
    }

    public static RestVo SUCCESS(Object data){
        return new RestVo(0, "success", data);
    }

    public static RestVo FAIL(){
        return new RestVo(1,"fail",null);
    }

    public static RestVo FAIL(String msg){
        return new RestVo(1,msg,null);
    }

    public static RestVo FAIL(Object data){
        return new RestVo(1,"fail",data);
    }
}
