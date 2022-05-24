package com.tong.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 童纯盼
 * @date 2022/3/31 11:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayStart {
    public static void main(String[] args) {
        SpringApplication.run(GatewayStart.class,args);
    }
}
