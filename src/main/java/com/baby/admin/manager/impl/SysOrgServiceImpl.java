package com.baby.admin.manager.impl;

import com.baby.admin.business.ISysUserDao;
import com.baby.admin.dao.IBaseDao;
import com.baby.admin.manager.ISysOrgService;
import com.baby.admin.service.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author tanbb
 * @Description 组织机构接口服务实现
 * @Date 2018/12/7 0:20
 * @Version 1.0
 **/
@Service("sysOrgService")
public class SysOrgServiceImpl extends AbstractService implements ISysOrgService {
    @Override
    @Resource(name="sysOrgDao")
    public void setBaseDao(IBaseDao baseDao) {
        super.baseDao = baseDao;
    }


}
