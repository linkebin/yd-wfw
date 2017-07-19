package com.yidusoft.service.impl;

import com.yidusoft.dao.QualityTestMapper;
import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.domain.Node;
import com.yidusoft.domain.QualityTest;
import com.yidusoft.domain.Tree;
import com.yidusoft.service.QualityTestService;
import com.yidusoft.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2017/07/10.
 */
@Service
@Transactional
public class QualityTestServiceImpl extends AbstractService<QualityTest> implements QualityTestService {
    @Resource
    private QualityTestMapper qualityTestMapper;
    public void updateDelete(String ids){
        qualityTestMapper.updateDelete(ids);
    }

    public List<QualityTest> getAll(QualityTest qualityTest){
        return qualityTestMapper.getAll(qualityTest);
    }

    public List<Tree> getProduct(){
        return qualityTestMapper.getProduct();
    }
}
