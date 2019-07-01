package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Idea;

public interface IdeaMapper {
    int insert(Idea record);

    int insertSelective(Idea record);
}