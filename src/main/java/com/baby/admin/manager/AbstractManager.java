package com.baby.admin.manager;

import com.alibaba.fastjson.JSON;
import com.baby.admin.model.IModel;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkun
 * @date 2018/11/25 10:57
 */
@Slf4j
public abstract class AbstractManager implements IManager {
    @Override
    public List<IModel> list(){
        List<IModel> list = new ArrayList<>();
        log.info("list:{}",JSON.toJSONString(list));
        return list;
    }

    @Override
    public IModel findOne(IModel model) {
        log.info("findOne:{}",JSON.toJSONString(model));
        return model;
    }

    @Override
    public List<IModel> findByQuery(List<IModel> list) {
        log.info("findByQuery:{}",JSON.toJSONString(list));
        return list;
    }

    @Override
    public void add(IModel model) {
        log.info("add:{}",JSON.toJSONString(model));
    }

    @Override
    public void delete(IModel model) {
        log.info("delete:{}",JSON.toJSONString(model));
    }

    @Override
    public void set(IModel model) {
        log.info("model:{}",JSON.toJSONString(model));
    }

}
