package com.baby.admin.web;

import com.alibaba.fastjson.JSON;
import com.baby.admin.service.IBaseService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author tanbb
 * @Description 基础控制器接口实现
 * @Date 2018/12/9 10:57
 * @Version 1.0
 **/
public abstract class AbstractController implements IBaseController{
    public IBaseService baseService;
    public IBaseService getBaseService() {
        return baseService;
    }
    public abstract void setBaseService(IBaseService baseService);

    @Override
    @RequestMapping("selectOne")
    public <T> String selectOne(T params) {
        return JSON.toJSONString(baseService.selectOne(params));
    }

}
