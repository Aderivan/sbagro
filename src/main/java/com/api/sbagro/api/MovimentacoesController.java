package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Movimentacoes;
import com.api.sbagro.domain.repository.MovimentacoesRepository;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacoesController {
	
	@Autowired
	private MovimentacoesRepository movimentacoesRepository;
	
	@GetMapping
	public List<Movimentacoes> list() {
		return movimentacoesRepository.listar();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movimentacoes save(@RequestBody Movimentacoes movimentacoes) {
		return movimentacoesRepository.save(movimentacoes);
	}
}
