package com.ease.arch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trace4Controller {

    @RequestMapping(value = "/trace-4", method = RequestMethod.GET)
    public String trace() {
        System.out.println("in trace-4");
        return "Trace4";
    }
}
