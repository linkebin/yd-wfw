package com.yidusoft.controller;
        import com.yidusoft.Utils.ActionResult;
        import com.yidusoft.Utils.JsonUtil;
        import com.yidusoft.dao.CompanyInfoDao;
        import com.yidusoft.domain.Aptitude;
        import com.yidusoft.domain.CompanyInfo;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ui.ModelMap;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import javax.validation.Valid;
/**
 * Created by linkb on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/")
public class CompanyInfoController {


    @Autowired
    CompanyInfoDao companyInfoDao;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value ="/companyInfo")
    public String companyInfo(Model model){
        /*model.addAttribute("getAll",companyInfoDao.getAll());*/
        return  "companyInfo/companyInfo-list";
    }


    @RequestMapping(value ="/add")
    public String index(String id,Model model){
        if(!id.equals("new")){
           CompanyInfo companyInfo = companyInfoDao.getOne(id);
            model.addAttribute("companyInfo",companyInfo);
        }
        return  "companyInfo/companyInfo-add-update";
    }

    /**
     * 添加一个用户
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addOrUpdate")
    public CompanyInfo insert(@Valid CompanyInfo companyInfo,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return null;
        }
        if(companyInfo.getCompanyId()==null) {
            companyInfo.setDeleted(0);
            DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            companyInfo.setCreateTime(df.format(new Date()));
            companyInfoDao.insert(companyInfo);
        }else{
            companyInfoDao.update(companyInfo);
        }
        return companyInfo;
    }

    /**
     * 根据ID删除用户
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete")
    public ActionResult delete(String ids){
        ActionResult result =new ActionResult(false);
        String _ids[] = ids.split(",");
        int sum=0;
        for(String id:_ids){
            sum+=companyInfoDao.delete(id);
        }
        if(sum>0)
            result.setSuccess(true);
        else
            result.setSuccess(false);
        return result;
    }

}
