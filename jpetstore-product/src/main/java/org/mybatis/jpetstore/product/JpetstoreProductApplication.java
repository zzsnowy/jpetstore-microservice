package org.mybatis.jpetstore.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import java.util.Locale;
import java.util.TimeZone;
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.mybatis.jpetstore.product.persistence") // 扫描映射器
public class JpetstoreProductApplication{

	public static void main(String[] args) {
		SpringApplication.run(JpetstoreProductApplication.class, args);
	}

}
