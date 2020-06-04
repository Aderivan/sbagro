package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Talhoes;
import com.api.sbagro.domain.repository.TalhoesRepository;

@Component
public class TalhoesRepositoryImpl implements TalhoesRepository{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Talhoes> listar() {
		return manager.createQuery("from Talhoes where sr_deleted <> 'T'", 
				Talhoes.class).getResultList();
	}

	@Override
	public Talhoes buscar(String id) {
		return manager.find(Talhoes.class, id);
	}

}
