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
 * @Description 组织机构控制器
 * @Date 2018/12/16 0:05
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/sysOrg")
public class SysOrgController extends AbstractController<SysOrg> {
    @Override
    @Resource(name="sysOrgService")
    public void setBaseService(IBaseService baseService) {
        super.baseService = baseService;
    }

    @Autowired
    private ISysOrgService sysOrgService;

    @Override
    protected void initSave(SysOrg params) {
        params.setParOrgId("01");
        params.setRootOrgtId("01");
        System.out.println("init save");
    }

    @Override
    protected void postSave(SysOrg params){
        super.delete(params.getOrgId());
        System.out.println("post save");
    }
}
