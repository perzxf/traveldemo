package com.zcf.mapper;

import com.zcf.model.TrTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TravelMapper {
    List<TrTest> queryTest();
}
