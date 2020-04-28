package com.gauk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MessageProperties.class)
@SpringBootApplication
public class AppconfigtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigtestApplication.class, args);
	}

}
