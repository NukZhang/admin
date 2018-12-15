package com.baby.admin.web;

/**
 * @Author tanbb
 * @Description 基础控制器接口
 * @Date 2018/12/9 10:57
 * @Version 1.0
 **/
public interface IBaseController<T> {

    /**
     * @Author tanbb
     * @Description 根据参数查询一个数据
     * @Date 2018/12/15 11:48
     * @Param [params]
     * @return java.lang.String
     **/
    public String selectOne(Object params);

    /**
     * @Author tanbb
     * @Description 根据页数和记录数查询分页数据
     * @Date 2018/12/15 11:48
     * @Param [page, rows] 页数和记录数
     * @return java.lang.String
     **/
    public String queryListPage(int page,int rows);

    /**
     * @Author tanbb
     * @Description 根据页数和记录数查询分页数据
     * @Date 2018/12/15 11:48
     * @Param [page, rows] 页数和记录数
     * @return java.lang.String
     **/
    public String queryListPage2(int page,int rows,T params);
}
