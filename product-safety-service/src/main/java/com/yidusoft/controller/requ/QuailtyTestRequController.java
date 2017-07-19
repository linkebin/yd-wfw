package com.yidusoft.controller.requ;

import com.alibaba.fastjson.JSON;
import com.yidusoft.domain.*;
import com.yidusoft.service.CompanyInfoService;
import com.yidusoft.service.QualityTestService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * Created by L on 2017/7/11.
 */
@Controller
@RequestMapping(value ="/qualityTest")
public class QuailtyTestRequController {
    @Resource
    private QualityTestService qualityTestService;

    //返回产品质量页面
    @RequestMapping(value ="")
    public String qualityTest(){
        return  "qualityTest/qualityTest-list";
    }

    /**
     * 根据id判断是添加还是修改，并返回相关数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value ="/insert")
    public String openAddUpdate(String id,Model model){
        if(!id.equals("new")){
            QualityTest qualityTest=qualityTestService.findBy("qualityTestId",id);
            model.addAttribute("qualityTest",qualityTest);
        }
        return  "qualityTest/qualityTest-add";
    }

    @Resource
    private CompanyInfoService companyInfoService;

    @RequestMapping(value ="/qualityTestTree",produces="application/json;charset=utf-8")
    @ResponseBody
    public void getJson(HttpServletResponse response) throws Exception{
        List<Tree> list = qualityTestService.getProduct();
        List<Node> l = companyInfoService.getCompanyTree();
        for(Node n:l){
            for(Tree t:list) {
                if(n.getTitle().equals(t.getTitle())){
                    n.setChildren(list);
                }
            }
        }
        Parent parent =new Parent(0L,"公司列表");
        parent.setChildren(l);
        String tt = JSON.toJSONString(parent);
        System.out.println(tt);
        OutputStream out = response.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        writer.write("[" + tt + "]");
        writer.close();
    }

    @RequestMapping(value = "/ethInfo")
    public String ethInfo(String id,Model model){
        String productName = "未选择企业，无区块链信息！";
        if(id!=null && StringUtils.isNotBlank(id)){
            QualityTest qualityTest =new QualityTest();
            qualityTest.setProductId(id);
            List<QualityTest> list=  qualityTestService.getAll(qualityTest);
            model.addAttribute("list",list);
            productName="无区块链信息";
            if (list.size()>0){
                productName=list.get(0).getName();
            }
        }
        model.addAttribute("productName",productName);
        return "qualityTest/eth-info";
    }
}
