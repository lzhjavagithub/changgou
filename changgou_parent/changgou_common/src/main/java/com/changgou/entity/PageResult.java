package com.changgou.entity;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private Long total;//总记录数
    private List<T> rows;//记录
}
