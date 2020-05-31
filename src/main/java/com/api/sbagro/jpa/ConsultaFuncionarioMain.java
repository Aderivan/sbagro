package com.api.sbagro.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.api.sbagro.ApiSbAgroApplication;
import com.api.sbagro.domain.model.Funcionario;
import com.api.sbagro.repositoryImpl.FuncionarioRepositoryImpl;

public class ConsultaFuncionarioMain {
	
public static void main(String[] args) {
		
		ApplicationContext aplicContext = new SpringApplicationBuilder(ApiSbAgroApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FuncionarioRepositoryImpl cadastroFuncionario = aplicContext.getBean(FuncionarioRepositoryImpl.class);
		
		List<Funcionario> funcionarios = cadastroFuncionario.listar();
		
		for(Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNomfun());
		}
	}
}
