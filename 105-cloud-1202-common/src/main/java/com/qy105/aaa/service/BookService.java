package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/29 11:00
 * @Description
 */
public interface BookService {
    /**
     * 公共接口，拿到所有书籍
     * @return
     */
    List<BookInfo> getAllBook();
}
