package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Eventos;
import com.api.sbagro.domain.repository.EventoRepository;

@Component
public class EventoRepositoryImpl implements EventoRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Eventos> listar() {
		return manager.createQuery("from Eventos where eventoDeletado <> 'T'",
				Eventos.class).getResultList();
	}

	@Override
	public Eventos buscar(String id) {
		return manager.find(Eventos.class, id);
	}
}
