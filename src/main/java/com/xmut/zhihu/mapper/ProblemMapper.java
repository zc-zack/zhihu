package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Problem;

public interface ProblemMapper {
    int insert(Problem record);

    int insertSelective(Problem record);
}