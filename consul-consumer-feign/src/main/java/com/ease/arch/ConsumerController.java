package com.ease.arch;

import com.ease.arch.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private DemoService demoService;

    @GetMapping("consumerDemo")
    public String consumerDemo() {
        return demoService.consumer();
    }

}
