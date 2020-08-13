package com.api.sbagro.domain.repository;

import java.util.List;

import com.api.sbagro.domain.model.Movimentacoes;

public interface MovimentacoesRepository {
	
	List<Movimentacoes> listar();
	Movimentacoes save(Movimentacoes movimentacoes);

}
