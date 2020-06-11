package com.changgou.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 返回结果实体类
 * @param <T>
 */
public class Result<T> {
    @ApiModelProperty(value = "执行是否成功,true:成功,false:失败",required = true)
    private boolean flag;//是否成功
    @ApiModelProperty(value = "返回状态码,20000：成功，20001：失败，20002：用户名或密码失败，20003：权限不足，20004：远程调用失败，20005：重复操作，20006：没有对应的数据",required = true)
    private Integer code;//返回码
    @ApiModelProperty(value = "提示消息", required = true)
    private String message;//返回消息
    @ApiModelProperty(value = "逻辑数据", required = true)
    private T data;//返回数据

    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
