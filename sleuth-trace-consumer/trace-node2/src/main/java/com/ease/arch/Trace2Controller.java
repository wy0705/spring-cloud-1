package com.ease.arch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trace2Controller {

    @Autowired
    private TraceService traceService;

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        System.out.println("in trace-2");
        return traceService.consumer();
    }
}
