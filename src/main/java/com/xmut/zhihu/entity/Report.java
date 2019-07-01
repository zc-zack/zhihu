package com.xmut.zhihu.entity;

public class Report {
    private Integer rid;

    private Integer uid;

    private Integer pid;

    private Integer reportUid;

    private String content;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getReportUid() {
        return reportUid;
    }

    public void setReportUid(Integer reportUid) {
        this.reportUid = reportUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}