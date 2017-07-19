package com.yidusoft.controller;
import com.alibaba.fastjson.JSON;
import com.yidusoft.core.Result;
import com.yidusoft.core.ResultGenerator;
import com.yidusoft.domain.Node;
import com.yidusoft.domain.Parent;
import com.yidusoft.domain.Product;
import com.yidusoft.feignInterface.CompanyServiceInterface;
import com.yidusoft.service.CompanyInfoService;
import com.yidusoft.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.*;

/**
* Created by CodeGenerator on 2017/07/10.
*/
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @PostMapping("/add")
    public Result add(Product product) {
        product.setProductId(UUID.randomUUID().toString());
        product.setCreateTime(new Date().toString());
        productService.save(product);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/deletes")
    public Result deleteBatch(@RequestParam String ids) {
        String arr [] = ids.split(",");
        for(String id :arr){
            productService.deletes(id);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        productService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Product product) {
        productService.update(product);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Product product = productService.findById(id);
        return ResultGenerator.genSuccessResult(product);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Product> list = productService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    /**
     * 查询公司产品列表
     * @param product
     * @return json数据
     */
    @RequestMapping(value = "/dataList")
    public Map<String,Object> dataList(@Valid Product product){
        Map<String,Object> map =new HashMap<String,Object>();

        List<Product> list = productService.getQueryAll(product);
        map.put("Rows",list);
        map.put("Total",list.size());
        return  map;
    }





}
