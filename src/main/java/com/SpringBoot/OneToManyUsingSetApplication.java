package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.SpringBoot")
@EnableJpaRepositories
public class OneToManyUsingSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyUsingSetApplication.class, args);
	}

}
