package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.config.JwtUtil;

import io.jsonwebtoken.Claims;

@SpringBootApplication
@ComponentScan("com.example.demo")
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		
		
		//Checking whether token is generated or not and testing
		JwtUtil util=new JwtUtil();
		String token=util.generateToken("saa", "sanjay", "sanju");
		System.out.println(token);
		
	Claims claims=	util.getClaims("sanju", token);
	System.out.println(claims.getSubject());
	
	
	
		
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
