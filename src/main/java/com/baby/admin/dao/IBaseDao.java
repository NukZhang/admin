package com.baby.admin.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author tanbb
 * @Description
 * @Date 2018/11/26 23:18
 * @Version 1.0
 **/
public interface IBaseDao {
    /**
     * @Author tanbb
     * @Description  获取对象列表
     * @Date 2018/11/26 23:19
     * @Param []
     * @return List<T>
     **/
    public <T> List<T> list();

    /**
     * @Author tanbb
     * @Description 根据对象主键id获取对象
     * @Date 2018/11/26 23:19
     * @Param [c, id] 对象class， 主键id
     * @return T 对象
     **/
    <T> T findOne(Class<Object> c, Object id);

    /**
     * @Author tanbb
     * @Description 根据查询参数查询对象集合
     * @Date 2018/11/27 22:21
     * @Param [map]
     * @return java.util.List<T>
     **/
    List<Object> findListByQuery(Map<String,Object> map);

    /**
     * @Author tanbb
     * @Description 保存对象
     * @Date 2018/11/27 22:21
     * @Param [Object]
     * @return void
     **/
    void add(Object o);

    /**
     * @Author tanbb
     * @Description 删除对象
     * @Date 2018/11/27 22:23
     * @Param [t]
     * @return void
     **/
    void delete(Object o);

    /**
     * @Author tanbb
     * @Description 更新对象
     * @Date 2018/11/27 22:24
     * @Param [o]
     * @return void
     **/
    void update(Object o);
}
