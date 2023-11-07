package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoApplication { //항상 프로그램의 최상단에 위치해있어야함.

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}