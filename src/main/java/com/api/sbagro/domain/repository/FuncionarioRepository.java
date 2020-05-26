package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Funcionario;

public interface FuncionarioRepository {
	
	List<Funcionario> listar();
	Funcionario buscar(String id);
}
