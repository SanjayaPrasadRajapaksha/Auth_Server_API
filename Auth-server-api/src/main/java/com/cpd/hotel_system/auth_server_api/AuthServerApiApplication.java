package com.cpd.hotel_system.auth_server_api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApiApplication.class, args);
	}

}
