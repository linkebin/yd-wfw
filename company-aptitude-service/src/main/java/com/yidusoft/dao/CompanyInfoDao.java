package com.yidusoft.dao;

import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.domain.json.Node;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/5.
 */
public interface CompanyInfoDao {

    List<Node> getTree();

    List<CompanyInfo> getAll(CompanyInfo companyInfo);

    CompanyInfo getOne(String companyId);

    void insert(CompanyInfo companyInfo);

    void update(CompanyInfo companyInfo);

    int delete(String companyId);

    List<Node> getCompanyTree();
}
