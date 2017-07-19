package com.yidusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/7.
 */
@Controller
@RequestMapping(value ="/")
public class IndexController {

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping(value ="/main")
    public String main(){
        return  "main";
    }

}
