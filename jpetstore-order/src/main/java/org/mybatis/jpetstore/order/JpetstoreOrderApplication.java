package org.mybatis.jpetstore.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages="org.mybatis.jpetstore.order.feign")
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.mybatis.jpetstore.order.persistence")
public class JpetstoreOrderApplication{
	public static void main(String[] args) {
		SpringApplication.run(JpetstoreOrderApplication.class,args);
	}

}
