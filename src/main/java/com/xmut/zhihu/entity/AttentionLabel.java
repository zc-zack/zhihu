package com.xmut.zhihu.entity;

import java.util.Date;

public class AttentionLabel {
    private Integer int;

    private Integer uid;

    private Integer lid;

    private Date time;

    public Integer getInt() {
        return int;
    }

    public void setInt(Integer int) {
        this.int = int;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}