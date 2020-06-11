package com.changgou.entity;

import lombok.Data;

/**
 * 返回结果实体类
 * @param <T>
 */
@Data
public class Result<T> {
    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回消息
    private T data;//返回数据
}
