package com.cqd.controller;

import com.cqd.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test1/{name}")
    public String test1(@PathVariable String name){
        String s = testApi.test1(name);
        return s;
    }

}
