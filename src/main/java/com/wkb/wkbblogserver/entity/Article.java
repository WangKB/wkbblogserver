package com.wkb.wkbblogserver.entity;

import javax.persistence.Table;

/**
 * Created by 79987 on 2017/1/5.
 */
@Table(name = "user")
public class Article extends BaseEntity{

    private String title;
    private String content;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
