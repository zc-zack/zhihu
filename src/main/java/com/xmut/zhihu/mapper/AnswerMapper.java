package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Answer;

public interface AnswerMapper {
    int insert(Answer record);

    int insertSelective(Answer record);
}