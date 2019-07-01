package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Dynamic;

public interface DynamicMapper {
    int insert(Dynamic record);

    int insertSelective(Dynamic record);
}