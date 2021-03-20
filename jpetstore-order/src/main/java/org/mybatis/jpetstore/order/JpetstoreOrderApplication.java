package org.mybatis.jpetstore.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
@MapperScan("org/mybatis/jpetstore/order/persistence")
public class JpetstoreOrderApplication{
	public static void main(String[] args) {
		SpringApplication.run(JpetstoreOrderApplication.class,args);
	}

}
