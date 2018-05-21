package com.ford.purchasing.ndpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NdpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(NdpcApplication.class, args);
	}
}
