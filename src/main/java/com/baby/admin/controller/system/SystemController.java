package com.baby.admin.controller.system;

import com.baby.admin.controller.AbstractController;
import com.baby.admin.manager.IManager;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangkun
 * @date 2018/11/25 13:16
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/system")
public class SystemController extends AbstractController {
    @Override
    @Resource(name="systemManager")
    public void setManager(IManager manager) {
        this.manager = manager;
    }
}
