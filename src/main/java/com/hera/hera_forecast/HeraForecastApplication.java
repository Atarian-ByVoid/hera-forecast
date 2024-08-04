package com.hera.hera_forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HeraForecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeraForecastApplication.class, args);
	}

}
