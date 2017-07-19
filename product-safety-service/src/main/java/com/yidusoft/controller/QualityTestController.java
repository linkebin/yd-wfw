package com.yidusoft.controller;
import com.yidusoft.core.Result;
import com.yidusoft.core.ResultGenerator;
import com.yidusoft.domain.Product;
import com.yidusoft.domain.QualityTest;
import com.yidusoft.service.QualityTestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
* Created by CodeGenerator on 2017/07/10.
*/
@RestController
@RequestMapping("/qualityTest")
public class QualityTestController {
    @Resource
    private QualityTestService qualityTestService;

    /**
     * 查询产品质量表
     * @return json数据
     */
    @RequestMapping(value = "/qualityList")
    public Map<String,Object> qualityList(@Valid QualityTest qualityTest){
        Map<String,Object> map =new HashMap<String,Object>();
        List<QualityTest> list = qualityTestService.getAll(qualityTest);
        map.put("Rows",list);
        map.put("Total",list.size());
        return  map;
    }

    /**
     * 添加或修改产品质量表
     * @param qualityTest
     * @return
     */
    @PostMapping("/AddOrUpdate")
    public Result add(QualityTest qualityTest) {
        if(qualityTest.getQualityTestId()==null){
            qualityTest.setQualityTestId(UUID.randomUUID().toString());
            qualityTest.setDeleted(0);
            DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            qualityTest.setCreateTime(df.format(new Date()));
            qualityTestService.save(qualityTest);
        }else{
            qualityTestService.update(qualityTest);
        }
        return ResultGenerator.genSuccessResult();
    }

    /***
     * 根据id批量删除产品质量表
     * @param ids
     * @return
     */
    @PostMapping("/updateDelete")
    public Result updateDelete(@RequestParam String ids) {
        String _ids[] = ids.split(",");
        for(String id:_ids) {
            qualityTestService.updateDelete(id);
        }
        return ResultGenerator.genSuccessResult();
    }



    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        qualityTestService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(QualityTest qualityTest) {
        qualityTestService.update(qualityTest);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        QualityTest qualityTest = qualityTestService.findById(id);
        return ResultGenerator.genSuccessResult(qualityTest);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<QualityTest> list = qualityTestService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
