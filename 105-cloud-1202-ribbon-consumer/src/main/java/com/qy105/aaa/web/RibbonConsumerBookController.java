package com.qy105.aaa.web;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/2 10:54
 * @Description 负载均衡，服务端的负载均衡（Nginx软件实现负载均衡，F5设备硬件实现负载均衡），客户端的负载均衡
 */
@RestController
public class RibbonConsumerBookController {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error",commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value ="5000")})
    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook() {
        LinkedList<BookInfo> forObject = restTemplate.getForObject("http://provider-server/getAllBook", LinkedList.class);
        System.out.println(forObject.size());

        return forObject;
    }

    public List<BookInfo> error() {
        System.out.println("服务熔断了");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("西游记");
        List<BookInfo> fallbackList = new LinkedList<>();
        fallbackList.add(bookInfo);
        return fallbackList;
    }



}
