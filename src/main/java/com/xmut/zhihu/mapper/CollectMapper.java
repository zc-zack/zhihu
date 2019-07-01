package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Collect;

public interface CollectMapper {
    int insert(Collect record);

    int insertSelective(Collect record);
}