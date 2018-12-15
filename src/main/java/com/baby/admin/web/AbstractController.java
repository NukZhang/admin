package com.baby.admin.web;

import com.alibaba.fastjson.JSON;
import com.baby.admin.service.IBaseService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author tanbb
 * @Description 基础控制器接口实现
 * @Date 2018/12/9 10:57
 * @Version 1.0
 **/
public abstract class AbstractController<T> implements IBaseController<T>{
    public IBaseService baseService;
    public IBaseService getBaseService() {
        return baseService;
    }
    public abstract void setBaseService(IBaseService baseService);

    @Override
    @RequestMapping("selectOne")
    public String selectOne(@RequestParam Object params) {
        return JSON.toJSONString(baseService.selectOne(params));
    }

    @Override
    @RequestMapping("queryListPage")
    public String queryListPage(int page,int rows){
        PageHelper.startPage(page, rows);
        return JSON.toJSONString(baseService.selectList(null));
    }

    @Override
    @RequestMapping("queryListPage2")
    public String queryListPage2(int page, int rows, T params) {
        PageHelper.startPage(page, rows);
        return JSON.toJSONString(baseService.selectList(params));
    }


}
