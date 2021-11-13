package com.ease.arch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider")
public interface DemoService {

    @GetMapping("/demo")
    String consumer();
}
