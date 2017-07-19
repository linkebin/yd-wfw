package com.yidusoft.service.impl;

import com.yidusoft.dao.ProductMapper;
import com.yidusoft.domain.Product;
import com.yidusoft.service.ProductService;
import com.yidusoft.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2017/07/10.
 */
@Service
@Transactional
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {
    @Resource
    private ProductMapper productMapper;

   public List<Product> getQueryAll(Product product){
       return productMapper.getQueryAll(product);
   }

   public void deletes(String id){
       productMapper.deletes(id);
   }

}
