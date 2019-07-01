package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.AttentionUser;

public interface AttentionUserMapper {
    int insert(AttentionUser record);

    int insertSelective(AttentionUser record);
}