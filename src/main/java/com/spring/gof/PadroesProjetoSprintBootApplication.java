package com.spring.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication


public class PadroesProjetoSprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSprintBootApplication.class, args);
	}

}
