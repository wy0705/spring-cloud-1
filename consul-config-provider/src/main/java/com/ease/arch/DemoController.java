package com.ease.arch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @GetMapping("demo1")
    public String demo() {
        return demoConfig.getName();
    }

}
