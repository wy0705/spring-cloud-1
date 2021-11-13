package com.ease.arch.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "consul-config-provider")
public interface ConfigService {


    @GetMapping("/demo1")
    String configDemo();
}
