package com.yidusoft.service;
import com.yidusoft.domain.Node;
import com.yidusoft.domain.QualityTest;
import com.yidusoft.core.Service;
import com.yidusoft.domain.Tree;

import java.util.List;


/**
 * Created by CodeGenerator on 2017/07/10.
 */
public interface QualityTestService extends Service<QualityTest> {

    void  updateDelete(String ids);

    List<QualityTest> getAll(QualityTest qualityTest);

    List<Tree> getProduct();
}
