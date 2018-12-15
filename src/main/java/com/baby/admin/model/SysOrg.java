package com.baby.admin.model;

/**
 * @Author tanbb
 * @Description 组织机构表
 * @Date 2018/12/9 0:19
 * @Version 1.0
 **/
public class SysOrg {
    private String orgId;//组织机构ID
    private String parOrgId;//上级组织机构ID
    private String rootOrgtId;//最上级组织ID
    private String orgName;//组织机构名称
    private int level;//层级
    private String content;//备注

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getParOrgId() {
        return parOrgId;
    }

    public void setParOrgId(String parOrgId) {
        this.parOrgId = parOrgId;
    }

    public String getRootOrgtId() {
        return rootOrgtId;
    }

    public void setRootOrgtId(String rootOrgtId) {
        this.rootOrgtId = rootOrgtId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
