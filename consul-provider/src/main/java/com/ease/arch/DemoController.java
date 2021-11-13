package com.ease.arch;


import com.ease.arch.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @Autowired
    private ConfigService configService;

    @GetMapping("demo")
    public String demo() {
//        String s=null;
//        s.length();
//        List<String> ids = demoConfig.getIds();
        String s = configService.configDemo();
        return "this is a consul provider,and:" +"aaaa" ;
    }

}
