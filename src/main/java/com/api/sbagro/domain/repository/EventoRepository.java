package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Eventos;

public interface EventoRepository {
	
	List<Eventos> listar();
	Eventos buscar(String id);
}
