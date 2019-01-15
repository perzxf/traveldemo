package com.zcf.service.Impl;

import com.zcf.mapper.TravelMapper;
import com.zcf.model.TrTest;
import com.zcf.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {
    @Autowired
    private TravelMapper travelMapper;

    @Override
    public List<TrTest> queryTest() {
        return travelMapper.queryTest();
    }
}
