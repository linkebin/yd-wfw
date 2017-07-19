package com.yidusoft.service;
import com.yidusoft.domain.Product;
import com.yidusoft.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2017/07/10.
 */
public interface ProductService extends Service<Product> {

    List<Product> getQueryAll(Product product);

    void deletes(String id);

}
