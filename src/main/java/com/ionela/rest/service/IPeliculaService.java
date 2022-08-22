package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Pelicula;



public interface IPeliculaService {

	//Metodos del CRUD
		public List<Pelicula> listarPeliculas(); //Listar All 
		
		public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda una pelicula CREATE
		
		public Pelicula peliculaXID(Long id); //Leer datos de una pelicula READ
		
		public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos de la peli UPDATE
		
		public void eliminarPelicula(Long id);// Elimina l apeli DELETE
}
