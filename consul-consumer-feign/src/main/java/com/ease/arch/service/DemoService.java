package com.ease.arch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(value = "consul-provider")
@FeignClient(value = "consul-provider",fallbackFactory = DemoServiceFallback.class)
public interface DemoService {

    @GetMapping("/demo")
    String consumer();


//    List<String> consumerList();
}
