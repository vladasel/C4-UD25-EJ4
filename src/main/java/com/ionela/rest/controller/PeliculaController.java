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

import com.ionela.rest.dto.Pelicula;
import com.ionela.rest.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/pelicuals")
	public List<Pelicula> listarPeliculas() {
		return peliculaServiceImpl.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {

		return peliculaServiceImpl.guardarPelicula(pelicula);
	}

	@GetMapping("/peliculas/{id}")
	public Pelicula peliculasXID(@PathVariable(name = "id") Long id) {

		Pelicula peli_xid = new Pelicula();

		peli_xid = peliculaServiceImpl.peliculaXID(id);

		System.out.println("Departamento XID: " + peli_xid);

		return peli_xid;
	}

	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Long id, @RequestBody Pelicula pelicula) {

		Pelicula peli_seleccionado = new Pelicula();
		Pelicula peli_actualizado = new Pelicula();

		peli_seleccionado = peliculaServiceImpl.peliculaXID(id);

		peli_seleccionado.setNombre(pelicula.getNombre());
		peli_seleccionado.setCalificacion_edad(pelicula.getCalificacion_edad());

		peli_actualizado = peliculaServiceImpl.actualizarPelicula(peli_seleccionado);

		return peli_actualizado;
	}

	@DeleteMapping("/peliculas/{id}")

	public void eleiminarPelicula(@PathVariable(name = "id") Long id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}
}
