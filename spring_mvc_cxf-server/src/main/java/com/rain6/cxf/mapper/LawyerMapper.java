package com.rain6.cxf.mapper;

import com.rain6.cxf.pojo.Lawyer;

public interface LawyerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lawyer record);

    int insertSelective(Lawyer record);

    Lawyer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lawyer record);

    int updateByPrimaryKey(Lawyer record);
}