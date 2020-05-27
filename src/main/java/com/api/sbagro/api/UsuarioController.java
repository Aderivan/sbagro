package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Usuarios;
import com.api.sbagro.domain.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping()
	public List<Usuarios> listar() {
		return usuarioRepository.listar();
	}
	
	@GetMapping("{usuarioId}")
	public ResponseEntity<Usuarios> buscar(@PathVariable String usuarioId) {
		Usuarios usuario = usuarioRepository.buscar(usuarioId);
		
		if(usuario != null && usuario.getUsuarioDeletado() != "T") {
			return ResponseEntity.ok(usuario);
		}
		
		return ResponseEntity.notFound().build();
	}
}
