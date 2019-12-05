package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZuulServerTest {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerTest.class);
    }

    @RequestMapping("testZuul")
    public String test(){
        System.out.println("===zuul ok====");
        return "zuul ok";
    }
}
