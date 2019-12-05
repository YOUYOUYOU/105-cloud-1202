package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/5 8:38
 * @Description
 */
@SpringBootApplication
//开启config server的注解
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer2App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer2App.class);
    }
}
