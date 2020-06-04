package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Talhoes;
import com.api.sbagro.domain.repository.TalhoesRepository;

@RestController
@RequestMapping("/talhoes")
public class TalhoesController {
	
	@Autowired
	private TalhoesRepository talhoesRepository;
	
	@GetMapping
	public List<Talhoes> listar() {
		return talhoesRepository.listar();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Talhoes> buscar(@PathVariable String id) {
		
		Talhoes talhoes = talhoesRepository.buscar(id);
		
		if(talhoes != null && talhoes.getSr_deleted() != "T") {
			return ResponseEntity.ok(talhoes);
		}
		
		return ResponseEntity.notFound().build();
	}
}
