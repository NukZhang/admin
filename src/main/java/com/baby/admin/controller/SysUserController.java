package com.baby.admin.controller;

import com.alibaba.fastjson.JSON;
import com.baby.admin.manager.ISysOrgService;
import com.baby.admin.manager.ISysUserService;
import com.baby.admin.model.SysOrg;
import com.baby.admin.model.SysUser;
import com.baby.admin.service.IBaseService;
import com.baby.admin.web.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author tanbb
 * @Description 用户控制器
 * @Date 2018/12/7 0:56
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/sysUser")
public class SysUserController extends AbstractController<SysUser> {
    @Override
    @Resource(name="sysUserService")
    public void setBaseService(IBaseService baseService) {
        super.baseService = baseService;
    }

    @Override
    protected void initSave(SysUser params) {
        System.out.println("int save");
    }

    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private ISysOrgService sysOrgService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return sysUserService.sayHello();
    }

    @RequestMapping("/selectOneOrg")
    public String selectOneOrg(){
        SysOrg org = sysOrgService.selectOne("0101");
        String orgStr = JSON.toJSONString(org);
        return orgStr;
    }

    @RequestMapping("/testMap")
    public String testMap(@RequestParam Map<String,Object> map){
        return JSON.toJSONString(map);
    }


}
