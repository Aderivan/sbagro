package com.api.sbagro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.api.sbagro.api.core.web.ApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperty.class)
public class ApiSbAgroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSbAgroApplication.class, args);
	}

}
