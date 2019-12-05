package com.qy105.aaa.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/4 21:30
 * @Description 注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
 */
@Data
public class BookInfo implements Serializable {
    private Long bookId;
    private String bookName;
    private Integer bookStore;
    private BigDecimal bookPrice;
}
