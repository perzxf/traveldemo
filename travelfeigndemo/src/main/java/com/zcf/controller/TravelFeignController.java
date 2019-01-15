package com.zcf.controller;

import com.zcf.model.TrTest;
import com.zcf.service.TravelServiceApi;
import com.zcf.service.TravelServiceFenign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelFeignController {
    @Autowired
    private TravelServiceApi travelServiceApi;

    @PostMapping("queryTest")
    public List<TrTest> queryTest(){
        return travelServiceApi.queryTest();
    }
}
