package com.zcf.service;

import com.zcf.model.TrTest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//熔断器失败处理器 必须实现fenign接口
@Component   //把此失败处理类注入spring环境中 方便调用
@RequestMapping("error/travel")
public class TravelServiceError implements TravelServiceFenign {
    @Override
    public List<TrTest> queryTest() {
        TrTest trTest = new TrTest();
        trTest.setErrorMessage("查询异常");
        List<TrTest> list=new ArrayList<>();
        list.add(trTest);
        return list;
    }
}
