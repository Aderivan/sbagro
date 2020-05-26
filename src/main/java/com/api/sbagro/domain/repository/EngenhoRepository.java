package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Engenho;

public interface EngenhoRepository {
	
	List<Engenho> listar();
	Engenho buscar(String id);
}
