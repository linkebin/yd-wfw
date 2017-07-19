package com.yidusoft.controller.rest;

import com.yidusoft.Utils.JsonUtil;
import com.yidusoft.dao.AptitudeDao;
import com.yidusoft.domain.Aptitude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/8.
 */
@RestController
public class AptitudeRestController {

    @Autowired
    AptitudeDao aptitudeDao;

    /**
     * 查询公司资质信息列表
     * @param aptitude  查询对象信息
     * @return json数据
     */
    @RequestMapping(value = "/aptitude/dataList")
    public Map<String,Object> dataList(@Valid Aptitude aptitude){
        Map<String,Object> map =new HashMap<String,Object>();

        List<Aptitude> list = aptitudeDao.getQueryAll(aptitude);
        map.put("Rows",list);
        map.put("Total",list.size());
        return  map;
    }
}
