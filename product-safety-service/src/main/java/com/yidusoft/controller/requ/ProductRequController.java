package com.yidusoft.controller.requ;

import com.alibaba.fastjson.JSON;
import com.yidusoft.domain.Node;
import com.yidusoft.domain.Parent;
import com.yidusoft.domain.Product;
import com.yidusoft.feignInterface.CompanyServiceInterface;
import com.yidusoft.service.CompanyInfoService;
import com.yidusoft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */
@Controller
@RequestMapping(value ="/product")
public class ProductRequController {

    @Resource
    private  ProductService productService;

    @RequestMapping(value ="")
    public String product(){
        return  "product/product-list";
    }

    @RequestMapping(value ="/open/add")
    public String openAddUpdate(String id,Model model){
        if(!id.equals("new")){
            Product product =productService.findBy("productId",id);
            model.addAttribute("product",product);
            return  "product/product-update";
        }
        return  "product/product-add";
    }

    @Resource
    private CompanyInfoService companyInfoService;

    @RequestMapping(value = "/companyTree", produces="application/json;charset=utf-8")
    @ResponseBody
    public void getJson(HttpServletResponse response) throws Exception{
        List<Node> l = companyInfoService.getTree();
        Parent parent =new Parent(0L,"公司列表");
        parent.setChildren(l);
        String tt =JSON.toJSONString(parent);
        System.out.println(tt);
        OutputStream out = response.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        writer.write("[" + tt + "]");
        writer.close();
    }







}
