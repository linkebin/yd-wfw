package com.yidusoft.controller;

import com.yidusoft.Utils.ActionResult;
import com.yidusoft.Utils.JsonUtil;
import com.yidusoft.dao.AptitudeDao;
import com.yidusoft.dao.CompanyInfoDao;
import com.yidusoft.domain.Aptitude;
import com.yidusoft.domain.json.Node;
import com.yidusoft.domain.json.Parent;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/7.
 */
@Controller
public class AptitudeController {

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Autowired
    AptitudeDao aptitudeDao;

    @RequestMapping(value ="/aptitude")
    public String aptitude(){
        return  "aptitude/aptitude-list";
    }

    /**
     * 获取公司树
     * @return
     */
    @RequestMapping(value = "/company/tree", produces="application/json;charset=utf-8")
    @ResponseBody
    public String getTree (){
        List<Node> l = companyInfoDao.getTree();
        Parent parent =new Parent(0L,"公司列表");
        parent.setChildren(l);
        return "["+JsonUtil.toJson(parent)+"]";
    }

    /**
     * 处理资质添加和修改跳转
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value ="/aptitude/link")
    public String addUpdate(String id,Model model){
        if(!id.equals("new")){
            Aptitude aptitude =aptitudeDao.getById(id);
            model.addAttribute("aptitude",aptitude);
        }
        return  "aptitude/aptitude-add-update";
    }

    /**
     * 保存资质信息
     * @param aptitude
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/aptitude/save")
    @ResponseBody
    public Aptitude aptitudeAdd(@Valid Aptitude aptitude, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return null;
        }
        if(aptitude.getAptitudeId()==null){
            aptitude.setDeleted(0);
            aptitude.setCreateTime(new Date().toString());
            aptitudeDao.insert(aptitude);
        }else{
            aptitudeDao.update(aptitude);
        }
        return aptitude;
    }


    /**
     * 删除资质
     * @param ids
     * @return
     */
    @PostMapping(value = "/aptitude/delete")
    @ResponseBody
    public ActionResult deleted(String ids){
        ActionResult result =new ActionResult(false);
        String _ids[] = ids.split(",");
        for(String id:_ids){
            aptitudeDao.delete(id);
        }
        result.setSuccess(true);
        return result;
    }

    @RequestMapping(value = "/ethInfo")
    public String ethInfo(String id,Model model){
        String companyName = "未选择企业，无区块链信息！";
        if(id!=null && StringUtils.isNotBlank(id)){
            Aptitude aptitude =new Aptitude();
            aptitude.setCompanyOibc(id);
            List<Aptitude> list=  aptitudeDao.getQueryAll(aptitude);
            model.addAttribute("list",list);
            companyName="无区块链信息";
            if (list.size()>0){
                companyName=list.get(0).getCompanyName();
            }
        }
        model.addAttribute("companyName",companyName);
        return "aptitude/eth-info";
    }
}
