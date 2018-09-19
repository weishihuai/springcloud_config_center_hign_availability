package com.springcloud.wsh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试客户端从配置服务中心获取配置文件中的内容
 *
 * @author weishihuai
 * @date 2018/9/19 10:15
 */
@RestController
//@RefreshScope注解的作用: 如果刷新了bean，那么下一次访问bean(即执行一个方法)时就会创建一个新实例。
@RefreshScope
public class GetPropertyFromConfigServerController {

    private static Logger logger = LoggerFactory.getLogger(GetPropertyFromConfigServerController.class);

    @Value("${com.springcloud.wsh.message}")
    String message;

    @RequestMapping("/getPropertyFromConfigServer")
    public String getPropertyFromConfigServer() {
        String msg = "hello, i am " + message + ", i'm come from config server";
        logger.info(msg);
        return msg;
    }

}
