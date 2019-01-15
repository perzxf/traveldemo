package com.zcf.controller;

import com.zcf.model.TrTest;
import com.zcf.service.TravelService;
import com.zcf.service.TravelServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController implements TravelServiceApi {
    @Autowired
    private TravelService travelService;

    @Override
    public List<TrTest> queryTest() {
        return travelService.queryTest();
    }
}
