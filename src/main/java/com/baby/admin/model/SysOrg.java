package com.baby.admin.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author tanbb
 * @Description 组织机构表
 * @Date 2018/12/9 0:19
 * @Version 1.0
 **/
@Getter
@Setter
public class SysOrg {
    private String orgId;//组织机构ID
    private String parOrgId;//上级组织机构ID
    private String rootOrgtId;//最上级组织ID
    private String orgName;//组织机构名称
    private int level;//层级
    private String content;//备注
}
