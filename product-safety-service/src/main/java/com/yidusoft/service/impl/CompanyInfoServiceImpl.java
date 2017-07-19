package com.yidusoft.service.impl;

import com.yidusoft.dao.CompanyInfoMapper;
import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.domain.Node;
import com.yidusoft.service.CompanyInfoService;
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
public class CompanyInfoServiceImpl extends AbstractService<CompanyInfo> implements CompanyInfoService {
    @Resource
    private CompanyInfoMapper companyInfoMapper;

    public List<Node> getTree(){
        return companyInfoMapper.getTree();
    }

    public List<Node> getCompanyTree(){
        return companyInfoMapper.getCompanyTree();
    }
}
