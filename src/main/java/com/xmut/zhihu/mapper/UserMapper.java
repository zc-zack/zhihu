package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}