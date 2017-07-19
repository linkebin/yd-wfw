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
    @RequestMapping(value ="/index")
    public String main(){
        return  "index";
    }


    @RequestMapping(value ="/authApply")
    public String authApply(){
        return  "auth/auth-apply";
    }

    @RequestMapping(value ="/authFlow")
    public String authFlow(){
        return  "auth/auth-flow";
    }


    @RequestMapping(value ="/writedCustom1")
    public String writedCustom1(){
        return  "writedCustom1";
    }

    @RequestMapping(value ="/level")
    public String level(){
        return  "level";
    }

    @RequestMapping(value ="/role")
    public String role(){
        return  "role";
    }


    @RequestMapping(value ="/login")
    public String login(){
        return  "login";
    }

    @RequestMapping(value ="/org")
    public String org(){
        return  "org";
    }


    @RequestMapping(value ="/menu")
    public String menu(){
        return  "menu";
    }

    @RequestMapping(value ="/sta")
    public String sta(){
        return  "menu";
    }


}
