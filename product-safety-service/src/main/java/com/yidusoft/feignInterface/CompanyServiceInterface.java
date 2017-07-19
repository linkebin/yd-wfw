package com.yidusoft.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/10.
 */
@Service
@FeignClient(value = "company-aptitude-service")
public interface CompanyServiceInterface {



}
