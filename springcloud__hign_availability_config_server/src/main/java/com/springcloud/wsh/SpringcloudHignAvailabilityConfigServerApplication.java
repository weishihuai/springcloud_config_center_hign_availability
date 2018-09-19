package com.springcloud.wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: 实际项目中当服务单元很多时，每个服务单元都从配置中心读取文件，这时可以将配置中心做成一个微服务(注册到eureka)，将其集群化(负载均衡)，达到高可用
 * @Author: WeiShiHuai
 * @Date: 2018/9/19 9:53
 */
@SpringBootApplication
//@EnableDiscoveryClient作用: 让config-server配置中心成为eureka的服务端，通过负载均衡实现高可用
@EnableDiscoveryClient
//开启分布式配置功能
@EnableConfigServer
public class SpringcloudHignAvailabilityConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHignAvailabilityConfigServerApplication.class, args);
    }
}
