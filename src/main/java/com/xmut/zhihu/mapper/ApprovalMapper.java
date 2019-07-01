package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Approval;

public interface ApprovalMapper {
    int insert(Approval record);

    int insertSelective(Approval record);
}