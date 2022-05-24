package com.tong.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 童纯盼
 * @date 2022/3/31 12:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductStart {
    public static void main(String[] args) {
        SpringApplication.run(ProductStart.class,args);
    }
}
