package com.qy105.aaa.service;

import com.qy105.aaa.mapper.BookMapper;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/12/2 10:40
 * @Description
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> bookInfos = bookMapper.getAllBook();
        if (null==bookInfos) {
            return null;
        }
        return bookInfos;
    }
}
