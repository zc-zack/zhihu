package com.xmut.zhihu.mapper;

import com.xmut.zhihu.entity.Report;

public interface ReportMapper {
    int insert(Report record);

    int insertSelective(Report record);
}