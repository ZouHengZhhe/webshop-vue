package com.zhhe.webshopvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhhe.webshopvue.web.mapper")
public class WebshopVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopVueApplication.class, args);
	}

}
