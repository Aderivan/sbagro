package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Movimentacoes;
import com.api.sbagro.domain.repository.MovimentacoesRepository;

@Component
public class MovimentacoesRepositoryImpl implements MovimentacoesRepository{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Movimentacoes> listar() {
		return manager.createQuery("from Movimentacoes where sr_deleted <> 'T'", 
				Movimentacoes.class).getResultList();
	}

	@Override
	@Transactional
	public Movimentacoes save(Movimentacoes movimentacoes) {
		return manager.merge(movimentacoes);
	}

}
