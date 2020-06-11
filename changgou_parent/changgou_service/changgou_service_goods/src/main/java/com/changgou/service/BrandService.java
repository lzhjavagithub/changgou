package com.changgou.service;

import com.changgou.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
