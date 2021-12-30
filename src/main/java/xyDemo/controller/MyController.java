package xyDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyDemo.service.MyService;

@Controller  // 表明为c层，方便调度
@EnableAutoConfiguration  // 自动装备注解，自动将代码中的对象加载
@Slf4j
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping("/getNum")
    @ResponseBody
    int getNum() {
        int i = myService.getNum();
        log.info("MyController get num: " + i);
        return i;
    }

    @RequestMapping(value = "/getName")
    @ResponseBody
    String getName(int id) {
        try {
            String s = myService.getName(id);
            return s;
        } catch (Exception e) {
            log.error("系统异常：" + e.toString());
            return "系统异常";
        }

    }

}
