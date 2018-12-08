package com.baby.admin.controller;

import com.alibaba.fastjson.JSON;
import com.baby.admin.manager.ISysOrgService;
import com.baby.admin.manager.ISysUserService;
import com.baby.admin.model.SysOrg;
import com.baby.admin.model.SysUser;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author tanbb
 * @Description 用户控制器
 * @Date 2018/12/7 0:56
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/sysUser")
public class SysUserController {
    @Resource(name="sysUserService")
    private ISysUserService sysUserService;
    @Resource(name="sysOrgService")
    private ISysOrgService sysOrgService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return sysUserService.sayHello();
    }

    @RequestMapping("/selectOneUser")
    public String selectOneUser(){
       SysUser user = sysUserService.selectOne("00430f37edd94419a704057cf3ade0be");
       String userStr = JSON.toJSONString(user);
       return userStr;
    }

    @RequestMapping("/selectOneOrg")
    public String selectOneOrg(){
        SysOrg org = sysOrgService.selectOne("0101");
        String orgStr = JSON.toJSONString(org);
        return orgStr;
    }
}
