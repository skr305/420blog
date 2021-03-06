package com.sang.po;

import lombok.Data;

/***
 * 0代表markdown
 * 1代表思维导图
 */
@Data
public class Blog {
    private String username;
    private String content;
    private int type;
    private String description;
    private int visible;

    //设置一页的显示数量
    final public static int onePageNumber = 10;
}
