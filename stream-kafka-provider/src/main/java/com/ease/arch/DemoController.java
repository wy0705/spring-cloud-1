package com.ease.arch;


import com.ease.arch.publisher.Producer;
import com.ease.arch.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private Producer producer;


    @RequestMapping(value = "/sendMessage/string", method = RequestMethod.POST)
    public String publishMessageString(@RequestBody String payload) {
        // send message to channel output
        producer.getSource().output().send(MessageBuilder.withPayload(payload).setHeader("type", "string").build());
        return "success";
    }


}
