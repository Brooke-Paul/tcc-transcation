package com.tcc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
        // 取消启动时热部署加载类， 否则会导致报错
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(WebApplication.class, args);
	}

}
