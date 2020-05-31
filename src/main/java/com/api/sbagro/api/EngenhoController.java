package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Engenho;
import com.api.sbagro.domain.repository.EngenhoRepository;

@RestController
@RequestMapping("/engenhos")
public class EngenhoController {

	@Autowired
	private EngenhoRepository engenhoRepository;
	
	
	@GetMapping
	public List<Engenho> listar() {
		return engenhoRepository.listar();
	}
	
	@GetMapping("{engenhoId}")
	public ResponseEntity<Engenho> buscar(@PathVariable String engenhoId) {
		Engenho engenho = engenhoRepository.buscar(engenhoId);
		
		if (engenho != null && engenho.getSr_deleted() != "T") {
			return ResponseEntity.ok(engenho);
		}
				
		return ResponseEntity.notFound().build();
	}
	
}
