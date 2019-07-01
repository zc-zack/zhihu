package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.TopPro;

public interface TopProMapper {
    int insert(TopPro record);

    int insertSelective(TopPro record);
}