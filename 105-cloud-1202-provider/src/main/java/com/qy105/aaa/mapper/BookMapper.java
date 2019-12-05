package com.qy105.aaa.mapper;

import com.qy105.aaa.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/29 11:18
 * @Description
 */
@Mapper
public interface BookMapper {
    /**
     * 拿到所有书籍
     * @return
     */
    @Select("select * from book_info")
    List<BookInfo> getAllBook();
}
