package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.PLabel;

public interface PLabelMapper {
    int insert(PLabel record);

    int insertSelective(PLabel record);
}