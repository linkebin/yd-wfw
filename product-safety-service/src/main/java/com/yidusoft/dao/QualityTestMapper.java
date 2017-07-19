package com.yidusoft.dao;

import com.yidusoft.core.Mapper;
import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.domain.Node;
import com.yidusoft.domain.QualityTest;
import com.yidusoft.domain.Tree;

import java.util.List;

public interface QualityTestMapper extends Mapper<QualityTest> {
    void updateDelete(String id);

    List<QualityTest> getAll(QualityTest qualityTest);

    List<Tree> getProduct();
}