package com.baby.admin.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author tanbb
 * @Description
 * @Date 2018/12/2 11:39
 * @Version 1.0
 **/
public class AbstractDao implements IBaseDao {

    @Override
    public <T> List<T> list() {

        return null;
    }

    @Override
    public Object findOne(Class<Object> c, Object id) {
        return null;
    }

    @Override
    public List<Object> findListByQuery(Map<String, Object> map) {
        return null;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void update(Object o) {

    }
}
