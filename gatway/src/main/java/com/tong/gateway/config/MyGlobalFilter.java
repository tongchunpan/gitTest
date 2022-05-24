package com.tong.gateway.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 童纯盼
 * @date 2022/5/22 13:40
 *
 * 添加全局的过滤器
 */
@Component
//用来添加优先级的,值越小优先级越高
@Order(1)
public class MyGlobalFilter implements GlobalFilter {
    /**
     *
     * @param exchange 请求上下文，里面可以获取request，response等信息
     * @param chain    用来把 请求交给下一个过滤器
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1.获取请求
        ServerHttpRequest request = exchange.getRequest();
        //2.获取请求参数
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        //3.得到具体需要的请求参数
        String authorization = queryParams.getFirst("authorization");

        //4.判断是否是否是我们需要的
        if ("authorization".equals(authorization)){
            //如果是就放行，
            return chain.filter(exchange);
        }
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        return exchange.getResponse().setComplete();


    }
}
