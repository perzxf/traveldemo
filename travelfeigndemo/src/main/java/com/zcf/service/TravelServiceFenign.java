package com.zcf.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "cloudprovider",fallback =TravelServiceError.class )//声明当前接口时一个feign客户端
public interface TravelServiceFenign extends TravelServiceApi{
}
