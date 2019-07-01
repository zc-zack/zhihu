package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Invite;

public interface InviteMapper {
    int insert(Invite record);

    int insertSelective(Invite record);
}