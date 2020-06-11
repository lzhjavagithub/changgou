package com.changgou.controller;

import com.changgou.entity.Result;
import com.changgou.entity.StatusCode;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/findAll")
    public Result<List<Brand>> findAll() {
        List<Brand> brandList = brandService.findAll();
        return new Result<List<Brand>>(true, StatusCode.OK, "查询品牌成功！", brandList);
    }

    @GetMapping("/findById")
    public Result<Brand> findById(Integer id) {
        Brand brand = brandService.findById(id);
        return new Result<Brand>(true, StatusCode.OK, "根据id查询品牌成功！", brand);
    }

}
