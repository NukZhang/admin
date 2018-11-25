package com.baby.admin.controller;

import com.alibaba.fastjson.JSON;
import com.baby.admin.manager.IManager;
import com.baby.admin.model.IModel;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhangkun
 * @date 2018/11/25 10:43
 */
public abstract class AbstractController {
    public IManager manager;
    @RequestMapping("list")
    public String list(){
        List<IModel> list = manager.list();
        return JSON.toJSONString(list);
    }
    @RequestMapping("findOne")
    public String findOne(IModel model){
        IModel modelResult = manager.findOne(model);
        return JSON.toJSONString(modelResult);
    }
    @RequestMapping("findByQuery")
    public String findByQuery(List<IModel> list){
        List<IModel>  listResult = manager.findByQuery(list);
        return JSON.toJSONString(listResult);
    }
//    public void add(IModel model){
//
//    }
//    void delete(IModel model);
//    void  set(IModel model);
    public IManager getManager(){
        return manager;
    }

    public abstract void setManager(IManager manager);
}
