package com.tong.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 童纯盼
 * @date 2022/3/27 12:31
 */
@RestController
public class SentinelTest {
    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
