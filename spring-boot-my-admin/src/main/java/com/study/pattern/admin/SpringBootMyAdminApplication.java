package com.study.pattern.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyAdminApplication.class, args);
	}

}
