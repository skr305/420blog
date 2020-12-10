package com.sang.po;

import lombok.Data;

/***
 * 0代表markdown
 * 1代表思维导图
 */
@Data
public class Blog {
    private String name;
    private String content;
    private int type;

    //设置一页的显示数量
    final public static int onePageNumber = 10;
}
