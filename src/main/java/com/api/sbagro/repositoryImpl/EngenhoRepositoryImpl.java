package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Engenho;
import com.api.sbagro.domain.repository.EngenhoRepository;

@Component
public class EngenhoRepositoryImpl implements EngenhoRepository {
	
	@PersistenceContext
	public EntityManager manager;

	@Override
	public List<Engenho> listar() {
		
		return manager.createQuery("from Engenho where sr_deleted <> 'T'", 
				Engenho.class).getResultList();
	}

	@Override
	public Engenho buscar(String id) {
		
		return manager.find(Engenho.class, id);
	}

}
