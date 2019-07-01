package com.xmut.zhihu.entity;

public class Invite {
    private Integer id;

    private Integer uid;

    private Integer inviteuser;

    private Integer status;

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

    public Integer getInviteuser() {
        return inviteuser;
    }

    public void setInviteuser(Integer inviteuser) {
        this.inviteuser = inviteuser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}