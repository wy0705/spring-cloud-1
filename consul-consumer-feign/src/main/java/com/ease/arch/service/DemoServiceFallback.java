package com.ease.arch.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoServiceFallback implements FallbackFactory<DemoService> {
    @Override
    public DemoService create(Throwable cause) {
        return new DemoService() {
            @Override
            public String consumer() {
                return "调用失败，请稍候重试！";
            }

//            @Override
//            public List<String> consumerList() {
//                ArrayList<Object> arrayList = new ArrayList<>();
//                arrayList.add("1");
//                arrayList.add("1");
//                arrayList.add("1");
//                arrayList.add("1");
//                arrayList.add("1");
//                return arrayList;
//            }
        };
    }
}
