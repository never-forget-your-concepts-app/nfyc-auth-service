package com.nfyc.nfycauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class NfycAuthServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(NfycAuthServiceApplication.class, args);
	}
}
