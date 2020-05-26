package com.api.sbagro.insfrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Funcionario;
import com.api.sbagro.domain.repository.FuncionarioRepository;

@Component
public class FuncionarioRepositoryImpl implements FuncionarioRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Funcionario> listar() {
		return manager.createQuery("from Funcionario", Funcionario.class).getResultList();
	}

	@Override
	public Funcionario buscar(String id) {
		return manager.find(Funcionario.class, id);
	}

}
