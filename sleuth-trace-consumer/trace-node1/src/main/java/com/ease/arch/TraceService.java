package com.ease.arch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "trace-node2")
public interface TraceService {

    @GetMapping("/trace-2")
    String consumer();
}
