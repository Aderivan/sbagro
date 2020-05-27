package com.api.sbagro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sbagro.domain.model.Eventos;
import com.api.sbagro.domain.repository.EventoRepository;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private EventoRepository eventoRepository;

	@GetMapping
	public List<Eventos> listar() {
		return eventoRepository.listar();
	}

	@GetMapping("{eventoId}")
	public ResponseEntity<Eventos> buscar(@PathVariable String eventoId) {
		Eventos evento = eventoRepository.buscar(eventoId);

		if (evento != null && evento.getEventoDeletado() != "T") {
			return ResponseEntity.ok(evento);
		}

		return ResponseEntity.notFound().build();
	}
}
