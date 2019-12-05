package com.qy105.aaa.web;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/2 10:02
 * @Description @RestController是一个组合注解，@Controller @ResponseBody
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    private int i = 1;

    @GetMapping("/getAllBook")
    public List<BookInfo> getAllBook() {
        System.out.println("get request in");
        List<BookInfo> allBook = bookService.getAllBook();
        if (null == allBook) {
            return null;
        }
        for (BookInfo bookInfo : allBook) {
            System.out.println(bookInfo);
        }
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return allBook;
    }


}
