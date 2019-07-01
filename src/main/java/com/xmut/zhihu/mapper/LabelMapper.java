package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Label;

public interface LabelMapper {
    int insert(Label record);

    int insertSelective(Label record);
}