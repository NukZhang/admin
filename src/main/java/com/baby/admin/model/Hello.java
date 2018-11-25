package com.baby.admin.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangkun
 * @date 2018/11/25 11:12
 */
@Getter
@Setter
public class Hello implements IModel {
    private String name;
    private String age;
}
