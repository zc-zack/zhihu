package com.xmut.zhihu.entity;

import java.util.Date;

public class PrivateLetter {
    private Integer id;

    private Integer uid;

    private Integer recevieUid;

    private Date time;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRecevieUid() {
        return recevieUid;
    }

    public void setRecevieUid(Integer recevieUid) {
        this.recevieUid = recevieUid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}