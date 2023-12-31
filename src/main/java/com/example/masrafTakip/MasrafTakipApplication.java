package com.example.masrafTakip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.example.masrafTakip.controller", "com.example.masrafTakip.repository"})
public class MasrafTakipApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasrafTakipApplication.class, args);
	}

}
