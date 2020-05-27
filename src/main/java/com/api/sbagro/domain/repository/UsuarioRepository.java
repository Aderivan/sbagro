package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Usuarios;

public interface UsuarioRepository {
	
	List<Usuarios> listar();
	Usuarios buscar(String id);
}
