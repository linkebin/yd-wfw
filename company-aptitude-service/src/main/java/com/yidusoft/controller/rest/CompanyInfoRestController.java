package com.yidusoft.controller.rest;

import com.yidusoft.dao.CompanyInfoDao;
import com.yidusoft.domain.Aptitude;
import com.yidusoft.domain.CompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by L on 2017/7/12.
 */
@RestController
public class CompanyInfoRestController {
    @Autowired
    CompanyInfoDao companyInfoDao;

    /**
     * 查询企业信息
     * @return json数据
     */
    @RequestMapping(value = "/companyInfo/dataList")
    public Map<String,Object> dataList(@Valid CompanyInfo companyInfo){
        Map<String, Object> map = new HashMap<String, Object>();
            List<CompanyInfo> list = companyInfoDao.getAll(companyInfo);
            map.put("Rows", list);
            map.put("Total", list.size());
        return  map;
    }
}
