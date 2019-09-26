package com.example.mcroservice.netfixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


import brave.sampler.Sampler;









@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetfixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfixZuulApiGatewayServerApplication.class, args);
		
	}
	
	
	
	@Bean 
	public Sampler defaultSampler() { 
		return new Sampler() {
	  
			 @Override 
			 public boolean isSampled(long traceId) {
			 
				 return true;
			 }
		};

	}
	 
}
