package com.yidusoft.service;
import com.yidusoft.domain.CompanyInfo;
import com.yidusoft.core.Service;
import com.yidusoft.domain.Node;

import java.util.List;


/**
 * Created by CodeGenerator on 2017/07/10.
 */
public interface CompanyInfoService extends Service<CompanyInfo> {
    List<Node> getTree();
    List<Node> getCompanyTree();
}
