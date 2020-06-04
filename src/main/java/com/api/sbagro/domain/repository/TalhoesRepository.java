package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Talhoes;

public interface TalhoesRepository {
	
	List<Talhoes> listar();
	Talhoes buscar(String id);
}
