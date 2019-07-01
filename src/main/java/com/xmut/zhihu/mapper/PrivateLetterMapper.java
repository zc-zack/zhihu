package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.PrivateLetter;

public interface PrivateLetterMapper {
    int insert(PrivateLetter record);

    int insertSelective(PrivateLetter record);
}