package org.mybatis.jpetstore.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * MyFilter
 *
 * @author mt.luo
 * @description:
 */
@Slf4j
@Component
public class MyFilter2 implements GlobalFilter, Ordered {
    @Autowired
    @Qualifier(value = "gateway-redis-template")
    private RedisTemplate redisTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("this is a pre filter2");

        Object ob = exchange.getRequest().getHeaders();
        log.info("zzzz"+ob.toString());
        String token = exchange.getRequest().getHeaders().getFirst("Cookie");
        log.info("pppppp"+token);
        redisTemplate.opsForValue().set("token:" + token, "aaaa");
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            log.info("this is a post filter2"+token);
        }));
    }

    @Override
    public int getOrder() {
        return -2;
    }
}
