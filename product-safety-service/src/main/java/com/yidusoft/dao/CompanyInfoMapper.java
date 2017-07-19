package com.yidusoft.dao;

import com.yidusoft.core.Mapper;
import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.domain.Node;

import java.util.List;

public interface CompanyInfoMapper extends Mapper<CompanyInfo> {
    List<Node> getTree();

    List<Node> getCompanyTree();
}