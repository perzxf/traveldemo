package com.zcf.service;

import com.zcf.model.TrTest;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("travel")
public interface TravelServiceApi {

    @RequestMapping("queryTestInfo")
    List<TrTest> queryTest();
}
