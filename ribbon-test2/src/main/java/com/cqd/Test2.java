package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test2 {
    public static void main(String[] args) {
        SpringApplication.run(Test2.class);
    }

    @RequestMapping("test2")
    public String test2(){
        System.out.println("test2健康");
        return "test2健康";
    }
}
