package com.cqd.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallback implements TestApi{

    @Override
    public String test1(String name) {
        return "出错了";
    }
}
