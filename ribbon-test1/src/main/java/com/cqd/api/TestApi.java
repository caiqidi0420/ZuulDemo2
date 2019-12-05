package com.cqd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ribbon2", fallback = TestFallback.class)
public interface TestApi {
    @RequestMapping("test1")
    public String test1(@RequestParam("name")String name);
}
