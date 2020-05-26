package com.api.sbagro.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.api.sbagro.ApiSbAgroApplication;
import com.api.sbagro.domain.model.Engenho;
import com.api.sbagro.insfrastructure.repository.EngenhoRepositoryImpl;

public class ConsultaEngenhoMain {
	
public static void main(String[] args) {
		
		ApplicationContext aplicContext = new SpringApplicationBuilder(ApiSbAgroApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EngenhoRepositoryImpl cadastroEngenho = aplicContext.getBean(EngenhoRepositoryImpl.class);
		
		List<Engenho> engenhos = cadastroEngenho.listar();
		
		for(Engenho engenho : engenhos) {
			System.out.println(engenho.getNome());
		}
	}
}
