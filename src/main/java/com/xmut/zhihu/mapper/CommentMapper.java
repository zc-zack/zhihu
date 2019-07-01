package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Comment;

public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}