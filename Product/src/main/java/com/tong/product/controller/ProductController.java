package com.tong.product.controller;

import com.alibaba.fastjson.JSON;
import com.tong.product.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author 童纯盼
 * @date 2022/3/31 12:15
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Value("${prr.g}")
    private String g;
    @GetMapping("/port")
    public String port(){
        return port;
    }

    @GetMapping("/value")
    public String value(){
        return g;
    }

    /**
     * 数据校验
     */
    @PostMapping("/message")
    public JSON messageTest(@Valid @RequestBody UserInfo userInfo , BindingResult result){
        System.out.println("log");
        if (result.hasErrors()){
            for (FieldError fieldError : result.getFieldErrors()) {
                System.out.print(fieldError.getField());
                System.out.print(":");
                System.out.println(fieldError.getDefaultMessage());
            }
        }

        return null;
    }



}
