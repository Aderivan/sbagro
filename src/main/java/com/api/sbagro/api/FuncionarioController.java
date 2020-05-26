package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Funcionario;
import com.api.sbagro.domain.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@GetMapping()
	public List<Funcionario> listar() {
		
		return funcionarioRepository.listar();
	}

	@GetMapping("{funcionarioId}")
	public ResponseEntity<Funcionario> buscar(@PathVariable String funcionarioId) {
		Funcionario funcionario = funcionarioRepository.buscar(funcionarioId);
		if (funcionario != null && funcionario.getFuncionarioDeletado() != "T"
				&& funcionario.getDataDemissao() == null) {
			return ResponseEntity.ok(funcionario);
		}

		return ResponseEntity.notFound().build();
	}

}
