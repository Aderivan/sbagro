package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Usuarios;
import com.api.sbagro.domain.repository.UsuarioRepository;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Usuarios> listar() {
		return manager.createQuery("from Usuarios where usuarioDeletado <> 'T'", 
				Usuarios.class).getResultList();
	}

	@Override
	public Usuarios buscar(String id) {
		return manager.find(Usuarios.class, id);
	}
}
