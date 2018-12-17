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
    @RequestMapping("queryList")
    public String queryList() {
        return JSON.toJSONString(baseService.selectList(null));
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

    protected void initSave(T params){}
    @Override
    @RequestMapping("save")
    public String save(T params) {
        initSave(params);
        String result="";
        int c = baseService.insert(params);
        if(c>0){
            result = "保存成功";
        }
        else{
            result = "保存失败";
        }
        postSave(params);
        return result;
    }
    protected void postSave(T params){}

    protected void initDelete(Object params){}
    @Override
    @RequestMapping("delete")
    public String delete(Object params) {
        initDelete(params);
        String result="";
        int c = baseService.delete(params);
        if(c>0){
            result = "删除成功";
        }
        else{
            result = "删除失败";
        }
        postDelete(params);
        return result;
    }
    protected void postDelete(Object params){}

    protected void initUpdate(T params){}
    @Override
    @RequestMapping("update")
    public String update(T params) {
        initUpdate(params);
        String result="";
        int c = baseService.update(params);
        if(c>0){
            result = "更新成功";
        }
        else{
            result = "更新失败";
        }
        postUpdate(params);
        return result;
    }
    protected void postUpdate(T params){}

}
