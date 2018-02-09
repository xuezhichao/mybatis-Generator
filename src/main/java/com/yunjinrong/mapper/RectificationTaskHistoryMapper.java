package com.yunjinrong.mapper;

import com.yunjinrong.entity.RectificationTaskHistory;

public interface RectificationTaskHistoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(RectificationTaskHistory record);

    int insertSelective(RectificationTaskHistory record);

    RectificationTaskHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RectificationTaskHistory record);

    int updateByPrimaryKey(RectificationTaskHistory record);
}