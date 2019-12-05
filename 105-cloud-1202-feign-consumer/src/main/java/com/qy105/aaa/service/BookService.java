package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/2 11:31
 * @Description
 */
@FeignClient(value = "provider-server")
public interface BookService {
    /**
     * 得到所有书籍
     * @return
     */
    @GetMapping("/getAllBook")
    List<BookInfo> getAllBook();
}
