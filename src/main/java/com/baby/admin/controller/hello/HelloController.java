package com.baby.admin.controller.hello;

import com.baby.admin.controller.AbstractController;
import com.baby.admin.manager.IManager;
import com.baby.admin.model.Hello;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangkun
 * @date 2018/11/25 10:38
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController extends AbstractController {
    @RequestMapping("/hello")
    private String index(){
        return "Hello Word";
    }

    @Override
    @Resource(name="helloManager")
    public void setManager(IManager manager) {
        this.manager=manager;
    }
}
