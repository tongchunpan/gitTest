package com.tong.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 童纯盼
 * @date 2022/3/27 11:47
 *
 *
 * 1.整合sentinel
 *      1.导入依赖spring-cloud-starter-alibaba-sentinel
 *      2.下载sentinel的控制台
 *      3.配置sentinel控制台地址信息
 *             sentinel:
 *                  transport:
 *                      dashboard: localhost:8080
 *                       port: 8719
 *      4.在控制台调整参数【默认所有的流控设置保存在内存中，重启失效】
 * 2.导入spring-boot-starter-actuator；配合
 *                      management:
 *                        endpoints:
 *                          web:
 *                            exposure:
 *                              include: *
 * 3.自定义sentinel控制返沪数据
 * 4.使用sentinel来保护feign远程调用：熔断：
 *      1.调用放的熔断保护：feign.sentinel.enabled=true
 *      2.调用方手动指定远程服务降级策略。远程服务被降级处理。触发我们的熔断回调方法
 *      3.超大浏览的时候，必须牺牲一些远程服务。在服务提供方指定降级策略；提供方是在运行。但是不运行自己的业务逻辑，返回的是默认的降级数据（限流的数据）
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelStart {
    public static void main(String[] args) {
        SpringApplication.run(SentinelStart.class,args);

    }
}
