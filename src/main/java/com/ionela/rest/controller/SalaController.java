package com.ionela.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ionela.rest.dto.Sala;
import com.ionela.rest.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	@Autowired
	SalaServiceImpl salaServiceImpl;

	@GetMapping("/salas")
	public List<Sala> listarDepartamentos() {
		return salaServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Sala salvarSala(@RequestBody Sala sala) {

		return salaServiceImpl.guardarSala(sala);
	}

	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name = "id") Long id) {

		Sala sala_xid = new Sala();

		sala_xid = salaServiceImpl.salaXID(id);

		System.out.println("Sala XID: " + sala_xid);

		return sala_xid;
	}

	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") Long id, @RequestBody Sala sala) {

		Sala sala_seleccionado = new Sala();
		Sala sala_actualizado = new Sala();

		sala_seleccionado = salaServiceImpl.salaXID(id);

		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());

		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);

		return sala_seleccionado;
	}

	@DeleteMapping("/salas/{id}")

	public void eleiminarSala(@PathVariable(name = "id") Long id) {
		salaServiceImpl.eliminarSala(id);
	}
}
