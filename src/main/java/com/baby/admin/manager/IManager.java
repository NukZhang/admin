package com.baby.admin.manager;

import com.baby.admin.model.IModel;

import java.util.List;

/**
 * @author zhangkun
 * @date 2018/11/25 10:44
 */
public interface IManager {
    List<IModel> list();
    IModel findOne(IModel model);
    List<IModel> findByQuery(List<IModel> list);
    void add(IModel model);
    void delete(IModel model);
    void  set(IModel model);
}
