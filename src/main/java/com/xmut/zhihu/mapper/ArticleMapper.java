package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Article;

public interface ArticleMapper {
    int insert(Article record);

    int insertSelective(Article record);
}