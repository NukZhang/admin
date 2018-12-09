package com.baby.admin.web;

import java.util.List;

/**
 * @Author tanbb
 * @Description 基础控制器接口
 * @Date 2018/12/9 10:57
 * @Version 1.0
 **/
public interface IBaseController {

    public <T> String selectOne(T params);
}
