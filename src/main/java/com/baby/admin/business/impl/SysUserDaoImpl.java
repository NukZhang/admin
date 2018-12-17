package com.baby.admin.business.impl;

import com.baby.admin.business.ISysUserDao;
import com.baby.admin.dao.AbstractDao;
import org.springframework.stereotype.Repository;

/**
 * @Author tanbb
 * @Description 用户持久层接口实现
 * @Date 2018/12/7 0:13
 * @Version 1.0
 **/
@Repository("sysUserDao")
public class SysUserDaoImpl extends AbstractDao implements ISysUserDao {

    @Override
    public String sayHello() {
        return "愉快的一天从写代码开始";
    }
}
