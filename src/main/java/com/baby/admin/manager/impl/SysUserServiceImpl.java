package com.baby.admin.manager.impl;

import com.baby.admin.business.ISysUserDao;
import com.baby.admin.dao.IBaseDao;
import com.baby.admin.manager.ISysUserService;
import com.baby.admin.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author tanbb
 * @Description 用户接口服务实现
 * @Date 2018/12/7 0:20
 * @Version 1.0
 **/
@Service("sysUserService")
public class SysUserServiceImpl extends AbstractService implements ISysUserService {
    @Override
    @Resource(name="sysUserDao")
    public void setBaseDao(IBaseDao baseDao) {
        super.baseDao = baseDao;
    }

    @Autowired
    private ISysUserDao sysUserDao;

    @Override
    public String sayHello() {
        return sysUserDao.sayHello();
    }
}
