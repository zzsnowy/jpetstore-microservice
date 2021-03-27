package org.mybatis.jpetstore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JpetstoreGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpetstoreGatewayApplication.class, args);
    }

}
