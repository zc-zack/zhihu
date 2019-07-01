package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.AttentionLabel;

public interface AttentionLabelMapper {
    int insert(AttentionLabel record);

    int insertSelective(AttentionLabel record);
}