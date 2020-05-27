package com.api.sbagro.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.api.sbagro.ApiSbAgroApplication;
import com.api.sbagro.domain.model.Usuarios;
import com.api.sbagro.repositoryImpl.UsuarioRepositoryImpl;

public class ConsultaUsuarioMain {
	
public static void main(String[] args) {
		
		ApplicationContext aplicContext = new SpringApplicationBuilder(ApiSbAgroApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		UsuarioRepositoryImpl cadastroUsuario = aplicContext.getBean(UsuarioRepositoryImpl.class);
		
		List<Usuarios> usuarios = cadastroUsuario.listar();
		
		for(Usuarios usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
	}
}
