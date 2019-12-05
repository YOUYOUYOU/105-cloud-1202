package com.qy105.aaa.web;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/2 11:34
 * @Description
 */
@RestController
public class FeignBookController {
    @Autowired
    private BookService bookService;

    @GetMapping("feignGetAllBook")
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        System.out.println("feign get book " + allBook.size());
        return allBook;
    }
}
