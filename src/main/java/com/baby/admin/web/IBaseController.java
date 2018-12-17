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
     * @Description 查询列表
     * @Date 2018/12/16 0:29
     * @Param []
     * @return java.lang.String
     **/
    public String queryList();

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

    /**
     * @Author tanbb
     * @Description 保存对象
     * @Date 2018/12/16 0:26
     * @Param [params]
     * @return java.lang.String
     **/
    public String save(T params);

    /**
     * @Author tanbb
     * @Description 删除对象
     * @Date 2018/12/16 0:27
     * @Param [params]
     * @return java.lang.String
     **/
    public String delete(Object params);

    /**
     * @Author tanbb
     * @Description 更新对象
     * @Date 2018/12/16 0:28
     * @Param [params]
     * @return java.lang.String
     **/
    public String update(T params);
}
