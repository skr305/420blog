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
    private String id;

    //设置一页的显示数量
    final public static int onePageNumber = 10;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getVisible() {
        return visible;
    }

    public String getId() {
        return id;
    }

    public static int getOnePageNumber() {
        return onePageNumber;
    }
}
