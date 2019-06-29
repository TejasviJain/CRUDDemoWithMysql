package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class CrudOperationWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationWithMysqlApplication.class, args);
	}

}
