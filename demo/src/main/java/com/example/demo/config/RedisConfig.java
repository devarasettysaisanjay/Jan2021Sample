package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.demo.entity.Employee;

//@Configuration
public class RedisConfig {
	
//	Step 1
//	@Bean
//	public RedisConnectionFactory cf() {
//		return  new LettuceConnectionFactory();
//	}
//	
//	//Step 2 ---create Resis Template
//	@Bean
//	public RedisTemplate<String, Employee> rt() {
//		RedisTemplate<String, Employee> template = new RedisTemplate<String, Employee>();
//		template.setConnectionFactory(cf());
//		return template;
//	}
//	
//	
	
	
	

}
