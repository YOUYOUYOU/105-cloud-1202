package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/3 9:31
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2App.class);
    }
}
