package com.lxj.kafka.web;

import com.lxj.kafka.util.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xingjing.Li
 * @since 2021/8/27
 */
@Slf4j
@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        InputMDC.putMDC();
        log.info("我是一条info日志");
        log.warn("我是一条warn日志");
        log.error("我是一条error日志");
        return "idx";
    }
}
