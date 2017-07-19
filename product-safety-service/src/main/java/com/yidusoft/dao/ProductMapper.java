package com.yidusoft.dao;

import com.yidusoft.core.Mapper;
import com.yidusoft.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper extends Mapper<Product> {
    List<Product> getQueryAll(Product product);

    void deletes(String id);
}