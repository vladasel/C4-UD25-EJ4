package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Sala;

public interface ISalaService {

	// Metodos del CRUD
	public List<Sala> listarSalas(); // Listar All

	public Sala guardarSala(Sala departamento); // Guarda un sala CREATE

	public Sala salaXID(Long id); // Leer datos de un sala READ

	public Sala actualizarSala(Sala sala); // Actualiza datos de sala UPDATE

	public void eliminarSala(Long id);// Elimina la sala DELETE
}
