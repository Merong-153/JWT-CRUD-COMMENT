package com.sparta.merong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MerongApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerongApplication.class, args);
	}

}
