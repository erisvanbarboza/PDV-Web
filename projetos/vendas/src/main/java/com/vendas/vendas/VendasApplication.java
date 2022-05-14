package com.vendas.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
