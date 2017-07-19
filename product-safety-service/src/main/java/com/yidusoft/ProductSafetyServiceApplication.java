package com.yidusoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class ProductSafetyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSafetyServiceApplication.class, args);
	}
}
